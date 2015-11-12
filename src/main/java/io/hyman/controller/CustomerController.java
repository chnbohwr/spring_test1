package io.hyman.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 10411303 on 2015/11/12.
 */
@RestController
public class CustomerController {
    @RequestMapping(method = RequestMethod.GET, value = "/customer")
    public String getCustomers(){
        return "Hello World";
    }
}
