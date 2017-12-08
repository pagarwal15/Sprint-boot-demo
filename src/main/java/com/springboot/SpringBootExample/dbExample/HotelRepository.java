package com.springboot.SpringBootExample.dbExample;

import com.springboot.SpringBootExample.dbExample.Hotel;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends MongoRepository<Hotel,String>{

	List<Hotel> findByPricePerNightGreaterThan(int maxprice);
	
	
	 @Query(value="{ 'pricePerNight' : {'$gt' : ?0} }")
	  List<Hotel> findByTheHotelPricePerNight(int price);

}
