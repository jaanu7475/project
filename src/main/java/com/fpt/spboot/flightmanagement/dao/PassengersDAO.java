package com.fpt.spboot.flightmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpt.spboot.flightmanagement.entity.Passengers;

public interface PassengersDAO extends JpaRepository<Passengers, String> {

}
