package com.mls.transport;

/**
 * @description:
 * @author: Patricia
 * @date: Created in 2020/5/17 0:25
 * @version: 1.0
 * @modified By:
 */
public class Aircraft extends AirTransport{
    public Aircraft() {
    }

    public Aircraft(String id) {
        super(id);
    }

    @Override
    public void drivingMethod() {
        System.out.println("Aircraft drivingMethod");
    }
}
