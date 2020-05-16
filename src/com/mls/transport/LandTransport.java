package com.mls.transport;

import java.util.Date;

/**
 * @description:
 * @author: Patricia
 * @date: Created in 2020/5/17 0:10
 * @version: 1.0
 * @modified By:
 */
public class LandTransport {
    private String id;
    private String ownership;
    private String Price;
    private Date dateOfPurchase;
    private String GPSPosition;

    public LandTransport() {
    }

    public LandTransport(String id) {
        this.id = id;
    }

    public void drivingMethod(){

    }
}
