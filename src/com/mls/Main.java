package com.mls;

import com.mls.person.Person;
import com.mls.transport.Airship;
import com.mls.transport.Automobile;
import com.mls.transport.Submarine;

/**
 * @description:main
 * @author: Patricia
 * @date: Created in 2020/5/17 0:18
 * @version: 1.0
 * @modified By:
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        Automobile automobile = new Automobile();
        Airship airship = new Airship();
        Submarine submarine = new Submarine();

        person.driveTransport(automobile);
        person.driveTransport(airship);
        person.driveTransport(submarine);
    }
}
