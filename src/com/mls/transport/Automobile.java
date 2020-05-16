package com.mls.transport;

/**
 * @description:
 * @author: Patricia
 * @date: Created in 2020/5/17 0:15
 * @version: 1.0
 * @modified By:
 */
public class Automobile extends LandTransport {
    public Automobile() {
    }

    public Automobile(String id) {
        super(id);
    }

    @Override
    public void drivingMethod() {
        System.out.println("Automobile drivingMethod");
    }
}
