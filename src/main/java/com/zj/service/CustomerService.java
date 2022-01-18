package com.zj.service;

import com.zj.dao.CustomerDao;
import com.zj.domain.Customer;

import java.sql.SQLException;
import java.util.List;

public class CustomerService {
    private CustomerDao customerDao=new CustomerDao();
    public void addCustomer(Customer customer) throws SQLException {
        customerDao.addCustomer(customer);
    }
    public List<Customer> finAllCustomers() throws SQLException {
        return customerDao.finAllCustomers();
    }
}
