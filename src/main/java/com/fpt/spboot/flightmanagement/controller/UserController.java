package com.fpt.spboot.flightmanagement.controller;
import java.sql.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fpt.spboot.flightmanagement.entity.Schedule_details;
import com.fpt.spboot.flightmanagement.service.UserServices;
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserServices  userServices;
	public UserController(UserServices userServices) {
		super();
		this.userServices = userServices;
	}
	
    @GetMapping(value ="/{schFrom}/{schTo}/{schDate}",produces = ("application/json") )
     public ResponseEntity<List<Schedule_details>> getAllScheduleDetails(@PathVariable("schFrom") String scheduleFrom,@PathVariable("schTo") String scheduleTo,@PathVariable("schDate") Date scheduleDate)
     {
    	 System.out.println(scheduleFrom+"  "+scheduleTo+"   "+scheduleDate);
    	 return new ResponseEntity<List<Schedule_details>>(userServices.getAllScheduleDetails(scheduleFrom,scheduleTo,scheduleDate),HttpStatus.OK);
     }
     
     @ExceptionHandler(RuntimeException.class)
 	public HttpStatus getErrorStatus(Exception ex) {
 		if(ex.getMessage().equals("NOT FOUND"))
 			return HttpStatus.NOT_FOUND;
 		return HttpStatus.NOT_MODIFIED;
 	}
     
     
	/*@GetMapping(value="/{flightId}",produces="application/json")
	public FlightDetails getFlight(@PathVariable String flightId)
	{
		return 
	}*/

}
