package com.hotelmanagement.DAO;

import java.util.List;

import com.hotelmanagement.api.Hotel;

public interface HotelDAO {
	
	 List<Hotel> loadHotels();
	 Hotel getHotel(int id);
	 void saveHotel(Hotel hotel);
	 void deleteData(int id);

}
