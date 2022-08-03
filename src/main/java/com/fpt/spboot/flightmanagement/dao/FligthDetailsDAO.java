package com.fpt.spboot.flightmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpt.spboot.flightmanagement.entity.Flight_details;

public interface FligthDetailsDAO extends JpaRepository<Flight_details, String> {

}
