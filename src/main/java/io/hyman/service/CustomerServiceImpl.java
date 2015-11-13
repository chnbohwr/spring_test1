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
    public boolean deleteCustomer(Customer customer) {
        customerDao.delete(customer.getId());
        return true;
    }

    //接收到修改通知，檢查有沒有該名customer，修改完畢之後，回傳customer或是null回去
    @Override
    public Customer updateCustomer(Customer customer) {
        Customer serverCustomer = customerDao.findOne(customer.getId());
        if(serverCustomer != null){
            customerDao.save(customer);
            return customer;
        }else{
            return null;
        }
    }

    @Override
    public Customer searchCustomer(String id) {
        Customer serverCustomer = customerDao.findOne(id);

        if(serverCustomer != null){
            return serverCustomer;
        }
        else{
            return null;
        }
    }
}
