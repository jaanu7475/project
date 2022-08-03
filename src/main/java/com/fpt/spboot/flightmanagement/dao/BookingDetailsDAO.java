package com.fpt.spboot.flightmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpt.spboot.flightmanagement.entity.Booking_table;

public interface BookingDetailsDAO extends JpaRepository<Booking_table, Integer> {

}
