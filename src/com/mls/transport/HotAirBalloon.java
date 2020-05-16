package com.mls.transport;

/**
 * @description:
 * @author: Patricia
 * @date: Created in 2020/5/17 0:24
 * @version: 1.0
 * @modified By:
 */
public class HotAirBalloon extends AirTransport {
    public HotAirBalloon() {
    }

    public HotAirBalloon(String id) {
        super(id);
    }

    @Override
    public void drivingMethod() {
        System.out.println("HotAirBalloon drivingMethod");
    }
}
