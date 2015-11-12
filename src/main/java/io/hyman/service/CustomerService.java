package io.hyman.service;

import io.hyman.domain.Customer;

import java.util.List;

/**
 * Created by 10411303 on 2015/11/12.
 */
public interface CustomerService{
    List<Customer> listCustomer();
    Customer addCustomer(String name,String phone);
    boolean deleteCustomer(long id);
    Customer updateCustomer(long id, String name , String phone);
    Customer searchCustomer(long id);
}
