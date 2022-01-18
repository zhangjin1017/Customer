package com.zj.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.Method;

public class BaseServlet extends HttpServlet {
    public HttpSession session = null;
    public String rootPath = null;

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        session = request.getSession();
        rootPath = request.getServletContext().getContextPath();

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        String methodName = request.getParameter("method");
        if (methodName == null) {
            throw new RuntimeException("请传递method参数以确定您要调用的方法！");
        }
        Method method = null;

        try {
            method = this.getClass().getMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(
                    "您调用的" + methodName + "(HttpServletRequest request , HttpServletResponse response)方法不存在", e);
        }
        try {
            method.setAccessible(true); //使用单一安全性检查（为了提高效率）

            String result = (String) method.invoke(this, request, response);

            /*
             * 简化重定向和转发操作
             * r:/index.jsp  重定向
             * f:/index.jsp  转发
             */
            if (result != null && !result.trim().isEmpty()) {

                String begin = result.substring(0, 1);  //分割出前缀  r或f
                String path = result.substring(2);	//分割出路径
                if("f".equals(begin)){	//前缀为f  表示转发
                    request.getRequestDispatcher(path).forward(request, response);
                }else if("r".equals(begin)){	//前缀为r 表示重定向
                    response.sendRedirect(request.getContextPath() + path);  //request.getContextPath()：项目名
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}