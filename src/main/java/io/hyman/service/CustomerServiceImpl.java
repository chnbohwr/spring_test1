package io.hyman.service;

import io.hyman.domain.Customer;
import io.hyman.domain.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 10411303 on 2015/11/12.
 */
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    public List<Customer> listCustomer() {
        return customerDao.findAll();
    }

    @Override
    public Customer addCustomer(Customer customer) {
        customerDao.save(customer);
        return customer;
    }

    @Override
    public boolean deleteCustomer(long id) {
        return false;
    }

    @Override
    public Customer updateCustomer(long id, String name, String phone) {
        return null;
    }

    @Override
    public Customer searchCustomer(long id) {
        return null;
    }
}
