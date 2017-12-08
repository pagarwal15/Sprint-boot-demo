package com.springboot.SpringBootExample.dbExample;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;


@Component
public class DbSeeder implements CommandLineRunner
{
    private HotelRepository hotelRepository;

    public DbSeeder(HotelRepository hotelRepository){
        this.hotelRepository=hotelRepository;
    }

    public void run(String... strings) throws Exception {
        Hotel taj= new Hotel(
                "Taj",
                100,
                new Address("bangalore" , "India"),
                Arrays.asList(
                        new Review("Prity",
                                5 ,
                                Boolean.TRUE)

                )
        );
        Hotel marriot= new Hotel(
                "Marriot",
                90,
                new Address("Delhi" , "India"),
                Arrays.asList(
                        new Review("Sam",
                                5 ,
                                Boolean.TRUE)

                )
        );

        //delete all hotels
        this.hotelRepository.deleteAll();
        //add hotels to repository
        List<Hotel> hotels = Arrays.asList(taj,marriot);
        this.hotelRepository.save(hotels);

    }
}
