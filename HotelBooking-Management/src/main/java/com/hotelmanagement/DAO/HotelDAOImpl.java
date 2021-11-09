package com.hotelmanagement.DAO;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;

import com.hotelmanagement.api.Hotel;
import com.hotelmanagement.rowmapper.HotelRowMapper;

@Repository
public class HotelDAOImpl implements HotelDAO {
	
	private static final Logger logger = Logger.getLogger(HotelDAOImpl.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Hotel> loadHotels() {
		// TODO Auto-generated method stub
		
		
		String sql = "SELECT * FROM hotels";
		
		
		  List<Hotel> hotelList = jdbcTemplate.query(sql,new HotelRowMapper());
		
		return hotelList;
	}

	@Override
	public Hotel getHotel(int id) {
		
		String sql = "SELECT * FROM hotels WHERE id = ?";
		
		Hotel hotel =jdbcTemplate.queryForObject(sql, new HotelRowMapper(), id);
		
		
		return hotel;
	}

	@Override
	public void saveHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		
		Object[] sqlParameters = {hotel.getId(),hotel.getName(),hotel.getAddress(),hotel.getPrice()};
	 String sql= "insert into hotels(id,name,address,price) values(?,?,?,?)";
	 
	 jdbcTemplate.update(sql,sqlParameters);
	 
	 logger.info("1 Record updated");
				
		
	}

	@Override
	public void deleteData(int id) {
		// TODO Auto-generated method stub
		
		String sql = "Delete from hotels where id=?";
		
		jdbcTemplate.update(sql, id);
		
	}

}
