package com.hotelmanagement.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelmanagement.DAO.HotelDAO;
import com.hotelmanagement.api.Hotel;
import com.hotelmanagement.controllers.HotelController;

@Service
public class HotelService {
	
	private static final Logger logger = Logger.getLogger(HotelController.class);
	
	@Autowired
	HotelDAO hotelDAO;
	
	public List<Hotel> loadHotels(){
	 List<Hotel> hotelList=	hotelDAO.loadHotels();
	 for(Hotel tempHotel: hotelList) {
			logger.info(tempHotel);
		}
	 return hotelList;
	}
	public Hotel getHotel(int id) {
		
		Hotel hotel = hotelDAO.getHotel(id);
		logger.info(hotel);
		
		return hotel;
	}
	public void saveHotel(Hotel hotel) {
		hotelDAO.saveHotel(hotel);
		logger.info(hotel);
	}
	public void deleteData(int id) {
		hotelDAO.deleteData(id);
	}

}
