package io.hyman.domain;

import javax.persistence.*;

/**
 * Created by 10411303 on 2015/11/12.
 */
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String name;
    private String phone;

    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    //for jpa constructor , do not delete this line
    public Customer() {}

    public Customer(String id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
