package com.zj.servlet;

import com.zj.commons.CommonUtils;
import com.zj.domain.Customer;
import com.zj.service.CustomerService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

@WebServlet(name = "CustomerServlet", value = "/CustomerServlet")
public class CustomerServlet extends BaseServlet {
    private CustomerService customerService=new CustomerService();

    public String add(HttpServletRequest req, HttpServletResponse res) throws SQLException, InvocationTargetException, InstantiationException, IllegalAccessException {

            Customer customer= CommonUtils.toBean(req.getParameterMap(),Customer.class);
            customer.setCid(CommonUtils.uuid());
            customerService.addCustomer(customer);
            req.setAttribute("msg","恭喜，添加客户成功！");
            return "f:/msg.jsp";
//            return "/msg.jsp";
//            return "F:/msg.jsp";
    }

    public String findAllCustomers(HttpServletRequest req, HttpServletResponse res) throws SQLException{

        req.setAttribute("customerList",customerService.finAllCustomers());
        return "f:/list.jsp";

    }
}
