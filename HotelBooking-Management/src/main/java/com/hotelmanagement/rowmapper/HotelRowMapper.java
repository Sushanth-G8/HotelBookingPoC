package com.hotelmanagement.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hotelmanagement.api.Hotel;

public class HotelRowMapper implements RowMapper<Hotel>{

	@Override
	public Hotel mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Hotel hotel = new Hotel();
		
	hotel.setId(rs.getInt("id"));
	hotel.setName(rs.getString("name"));
	hotel.setAddress(rs.getString("address"));
	hotel.setPrice(rs.getInt("price"));
		
		
		return hotel;
	}

}
