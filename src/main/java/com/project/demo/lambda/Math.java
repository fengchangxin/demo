package com.project.demo.lambda;

/**
 * @author: fcx
 * @date: 2019-11-19 21:58
 * @description:
 */
public class Math implements IMath {
    @Override
    public int hand(int a, int b) {
        return a + b;
    }
}
