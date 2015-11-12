package io.hyman.domain;

import javax.persistence.Entity;

/**
 * Created by 10411303 on 2015/11/12.
 */
@Entity
public class Customer {
    private String id;
    private String name;
    private String phone;

    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
