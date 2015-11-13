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
//test
    @Autowired
    private CustomerService customerService;

    //取得所有的customer
    @RequestMapping(method = RequestMethod.GET)
    public List<Customer> getCustomers() {
        return customerService.listCustomer();
    }

    /**
     * 新增customer
     * {"name":"jack","phone":"0988999888"}
     * @param tempCustomerObject
     * @return Customer
     */
    @RequestMapping(method = RequestMethod.POST)
    public Customer addCustomer(@RequestBody CustomerAddParam tempCustomerObject) {
        Customer customer = new Customer(tempCustomerObject.getName(), tempCustomerObject.getPhone());
        customerService.addCustomer(customer);
        return customer;
    }

    /**
     * 修改customer
     * {"id":"1","name":"Micjack","phone":"0988999888"}
     * @param customer
     * @return Customer
     */
    @RequestMapping(method = RequestMethod.PUT)
    public Customer updateCustomer(@RequestBody CustomerAddParam customer) {
        Customer temp_customer = new Customer(customer.getId(),customer.getName(),customer.getPhone());
        Customer serverCustomer = customerService.updateCustomer(temp_customer);
        return serverCustomer;
    }

    /**
     * 刪除customer
     * {"id":"1"}
     * @param customer
     * @return boolean true/false
     */
    @RequestMapping(method = RequestMethod.DELETE)
    public boolean deleteCustomer(@RequestBody CustomerAddParam customer){
        Customer temp_customer = new Customer(customer.getId(),customer.getName(),customer.getPhone());
        return customerService.deleteCustomer(temp_customer);
    }

    //測試功能,post /customer/test 不用參數可以直接新增customer
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public Customer addTestCustomer() {
        Customer customer = new Customer("TestUser", "0987654321");
        customerService.addCustomer(customer);
        return customer;
    }
}
