package io.hyman.controller;

import io.hyman.domain.Customer;
import io.hyman.domain.param.CustomerAddParam;
import io.hyman.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 10411303 on 2015/11/12.
 */
@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Customer> getCustomers() {
        System.out.println("Get request============================");
        return customerService.listCustomer();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Customer addCustomer(@RequestBody CustomerAddParam tempCustomerObject) {
        System.out.println("got a reg form : " + tempCustomerObject + "===================================");
        Customer customer = new Customer(tempCustomerObject.getName(), tempCustomerObject.getPhone());
        customerService.addCustomer(customer);
        return customer;
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public Customer addTestCustomer(){
        Customer customer = new Customer("TestUser","0987654321");
        customerService.addCustomer(customer);
        return customer;
    }
}
