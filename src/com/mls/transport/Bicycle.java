package com.mls.transport;

/**
 * @description:
 * @author: Patricia
 * @date: Created in 2020/5/17 0:19
 * @version: 1.0
 * @modified By:
 */
public class Bicycle extends LandTransport {
    public Bicycle() {
    }

    public Bicycle(String id) {
        super(id);
    }

    @Override
    public void drivingMethod() {
        System.out.println("Bicycle drivingMethod");
    }
}
