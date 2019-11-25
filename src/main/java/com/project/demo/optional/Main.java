package com.project.demo.optional;

import com.alibaba.fastjson.JSON;

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

        System.out.println(JSON.toJSONString(user));
        //{"address":{"country":{"country":"zh"},"mail":"xxxx.com"}}
    }
}
