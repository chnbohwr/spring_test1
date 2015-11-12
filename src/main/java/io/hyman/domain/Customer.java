package io.hyman.domain;

/**
 * Created by 10411303 on 2015/11/12.
 */

public class Customer {
    private long id;
    private String name;
    private String phone;

    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
