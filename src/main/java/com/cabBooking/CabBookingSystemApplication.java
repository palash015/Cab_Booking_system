package com.cabBooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.cabBooking")
public class CabBookingSystemApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(CabBookingSystemApplication.class, args);
    }
}
