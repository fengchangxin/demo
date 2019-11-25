package com.project.demo.optional;

import java.util.Optional;

/**
 * @author: fcx
 * @date: 2019-11-25 22:53
 * @description:
 */
public class User {
    //private Optional<Address> address;

    private Address address;

    private String name;

//    public Optional<Address> getAddress() {
//        return address;
//    }
//
//    public void setAddress(Optional<Address> address) {
//        this.address = address;
//    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
