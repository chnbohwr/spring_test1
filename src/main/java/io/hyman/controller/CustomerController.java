package io.hyman.controller;

import io.hyman.domain.Customer;
import io.hyman.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 10411303 on 2015/11/12.
 */
@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(method = RequestMethod.GET, value = "/customer")
    public List<Customer> getCustomers() {
        return customerService.listCustomer();
    }
}
