package com.fpt.spboot.flightmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fpt.spboot.flightmanagement.entity.Airport_details;

public interface AirportDetailsDAO extends JpaRepository<Airport_details, String> {

}
