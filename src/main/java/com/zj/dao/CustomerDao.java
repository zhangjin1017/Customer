package com.zj.dao;

import com.zj.domain.Customer;
import com.zj.util.DBUtilsByDruid;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class CustomerDao {
    private QueryRunner qr=new QueryRunner();

    public void addCustomer(Customer customer) throws SQLException {
        String sql="insert into t_customer values(?,?,?,?,?,?,?)";
        Object[] params = {customer.getCid(),customer.getCname(), customer.getGender(),customer.getBirthday(),
        customer.getCellphone(),customer.getEmail(),customer.getDescription()};
        qr.update( DBUtilsByDruid.getConnection(),sql,params);
    }

    public List<Customer> finAllCustomers() throws SQLException {
        String sql="select * from  t_customer";

       return qr.query( DBUtilsByDruid.getConnection(),sql,new BeanListHandler<Customer>(Customer.class));
    }
}
