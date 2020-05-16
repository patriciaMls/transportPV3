package com.mls.person;

import com.mls.transport.AirTransport;
import com.mls.transport.LandTransport;
import com.mls.transport.MarimeMeansOfTransport;

/**
 * @description:
 * @author: Patricia
 * @date: Created in 2020/5/17 0:16
 * @version: 1.0
 * @modified By:
 */
public class Person {
    private int p_Age;
    private String p_Sex;
    private String id;
    private String p_Name;

    public Person() {
    }

    public Person(String id) {
        this.id = id;
    }

    public void driveTransport(LandTransport landTransport){
        landTransport.drivingMethod();
    }
    public void driveTransport(AirTransport airTransport){
        airTransport.drivingMethod();
    }
    public void driveTransport(MarimeMeansOfTransport marimeMeansOfTransport){
        marimeMeansOfTransport.drivingMethod();
    }
}
