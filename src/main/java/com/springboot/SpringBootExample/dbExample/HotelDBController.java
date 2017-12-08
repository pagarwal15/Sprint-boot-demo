package com.springboot.SpringBootExample.dbExample;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

@RestController
@RequestMapping("/hotels")
@Api(value="Hotel Information")
public class HotelDBController {

    private HotelRepository hotelRepository;
    public HotelDBController(HotelRepository hotelRepository){
        this.hotelRepository=hotelRepository;
    }
   @ApiOperation(value="Fetch all the hotel information" , response=List.class)
    @GetMapping(value={"**/all"})
    public List<Hotel> getAllHotels(){
        List<Hotel> hotels =  this.hotelRepository.findAll();
        return hotels;
    }
    @PutMapping
    public void  insert(@RequestBody Hotel hotel){
    	this.hotelRepository.insert(hotel);
    	
    }
    @PostMapping
    public void update(@RequestBody Hotel hotel){
    	this.hotelRepository.save(hotel);
    	
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id){
    	this.hotelRepository.delete(id);
    }
    
    @GetMapping("/price/{maxPrice}")
    public List<Hotel>  getPricePerNight(@PathVariable("maxPrice") int maxprice){
    	List<Hotel> hotelList = this.hotelRepository.findByPricePerNightGreaterThan(maxprice);
    	return hotelList;
    }
    
    @GetMapping("/price1/{maxPrice}")
    public List<Hotel>  getHotelPricePerNight(@PathVariable("maxPrice") int maxprice){
    	List<Hotel> hotelList = this.hotelRepository.findByTheHotelPricePerNight(maxprice);
    	return hotelList;
    }
}
