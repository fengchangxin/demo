package com.project.demo.optional;

import com.alibaba.fastjson.JSON;

import java.time.format.DateTimeFormatter;
import java.util.Optional;

/**
 * @author: fcx
 * @date: 2019-11-25 22:53
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        User user = new User();
        Address address = new Address();
        address.setMail("xxxx.com");

        Country country = new Country();
        country.setCountry("zh");

        address.setCountry(country);

        user.setAddress(address);

        if (user != null) {
            Address a = user.getAddress();
            if (a != null) {
                Country c = a.getCountry();
                if (c != null) {
                    //TODO
                }
            }
        }


        System.out.println(Optional.ofNullable(user).map(User::getAddress).map(Address::getCountry)
                .map(Country::getCountry).orElse(null));
    }
}
