package com.mls.transport;

/**
 * @description:
 * @author: Patricia
 * @date: Created in 2020/5/17 0:27
 * @version: 1.0
 * @modified By:
 */
public class Ship extends MarimeMeansOfTransport {
    public Ship() {
    }

    public Ship(String id) {
        super(id);
    }

    @Override
    public void drivingMethod() {
        System.out.println("Ship drivingMethod");
    }
}
