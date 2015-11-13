package io.hyman.service;

import io.hyman.domain.Customer;

import java.util.List;

/**
 * Created by 10411303 on 2015/11/12.
 */
public interface CustomerService{
    List<Customer> listCustomer();
    Customer addCustomer(Customer customer);
    boolean deleteCustomer(Customer customer);
    Customer updateCustomer(Customer customer);

    /**
     * TODO
     * 搜尋customer功能，尚未完成。
     * @param id
     * @return
     */
    Customer searchCustomer(String id);
}
