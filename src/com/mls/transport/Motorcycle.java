package com.mls.transport;

/**
 * @description:
 * @author: Patricia
 * @date: Created in 2020/5/17 0:22
 * @version: 1.0
 * @modified By:
 */
public class Motorcycle extends LandTransport {
    public Motorcycle() {
    }

    public Motorcycle(String id) {
        super(id);
    }

    @Override
    public void drivingMethod() {
        System.out.println("Motorcycle drivingMethod");
    }
}
