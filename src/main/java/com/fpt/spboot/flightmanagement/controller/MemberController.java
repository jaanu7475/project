package com.fpt.spboot.flightmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fpt.spboot.flightmanagement.entity.Booking_table;
import com.fpt.spboot.flightmanagement.service.MemberService;

@RestController
@RequestMapping("/Member")
public class MemberController {
	@Autowired
	MemberService memberService;

	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}
	
	@PostMapping(consumes="application/json")
	public HttpStatus addBookingDetails(@RequestBody Booking_table bookingDetails ) {
		memberService.addBoookingDetails(bookingDetails);
		return HttpStatus.OK;
		
	}
	
	@GetMapping(value="/{bdid}",produces = "application/json")
	public ResponseEntity<Booking_table> getBookingDetails(@PathVariable("bdid") Integer bookingId){
		return new ResponseEntity<Booking_table>(memberService.viewBookingDetails(bookingId),HttpStatus.OK);
		
	}

}
