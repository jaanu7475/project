package com.fpt.spboot.flightmanagement.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.fpt.spboot.flightmanagement.dao.BookingDetailsDAO;
import com.fpt.spboot.flightmanagement.dao.MemberTableDAO;
import com.fpt.spboot.flightmanagement.entity.Booking_table;

@Service
public class MemberService {

	@Autowired
	MemberTableDAO membertableDAO;

	public void setMembertableDAO(MemberTableDAO membertableDAO) {
		this.membertableDAO = membertableDAO;
	}

	@Autowired
	BookingDetailsDAO bookingDetailsDAO;

	public void setBookingDetailsDAO(BookingDetailsDAO bookingDetailsDAO) {
		this.bookingDetailsDAO = bookingDetailsDAO;
	}

	@Transactional
	public boolean addBoookingDetails(Booking_table bookingDetails) {

		Booking_table bd = bookingDetailsDAO.save(bookingDetails);
		if (bd != null)
			return true;
		throw new RuntimeException("Not Modified");
	}
	
	@Transactional
	public Booking_table viewBookingDetails(Integer bookingId) {
		Optional<Booking_table> bd = bookingDetailsDAO.findById(bookingId);
		if(bd.isPresent())
			return bd.get();
		throw new RuntimeException("Not Found");
	}

}
