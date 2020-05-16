package com.mls.transport;

/**
 * @description:
 * @author: Patricia
 * @date: Created in 2020/5/17 0:21
 * @version: 1.0
 * @modified By:
 */
public class Train extends LandTransport {
    public Train() {
    }

    public Train(String id) {
        super(id);
    }

    @Override
    public void drivingMethod() {
        System.out.println("Train drivingMethod");
    }
}
