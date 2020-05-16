package com.mls.transport;

/**
 * @description:
 * @author: Patricia
 * @date: Created in 2020/5/17 0:23
 * @version: 1.0
 * @modified By:
 */
public class Airship extends AirTransport {
    public Airship() {
    }

    public Airship(String id) {
        super(id);
    }

    @Override
    public void drivingMethod() {
        System.out.println("Airship drivingMethod");
    }
}
