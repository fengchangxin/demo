package com.project.demo.optional;

import java.util.Optional;

/**
 * @author: fcx
 * @date: 2019-11-25 22:53
 * @description:
 */
public class Address {
    ///private Optional<Country> country;
    private Country country;

    private String mail;

//    public Optional<Country> getCountry() {
//        return country;
//    }
//
//    public void setCountry(Optional<Country> country) {
//        this.country = country;
//    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
