package com.fpt.spboot.flightmanagement.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fpt.spboot.flightmanagement.dao.ScheduleDAO;

import com.fpt.spboot.flightmanagement.entity.Schedule_details;
@Service

public class UserServices {
	@Autowired
	ScheduleDAO scheduledao;
	public void setMemberdao(ScheduleDAO scheduledao) {
		this.scheduledao = scheduledao;
	}
	
	@Transactional(readOnly = true)
	public List<Schedule_details> getAllScheduleDetails(String scheduleFrom,String scheduleTo,Date scheduleDate){
		List<Schedule_details> schedule = scheduledao.findAll();//scheduledao.findByScheduleFromAndScheduleToAndScheduleDate(scheduleFrom, scheduleTo, scheduleDate);
		if(schedule.size()>0)
			return schedule;
		throw new RuntimeException("NOT FOUND");
	}
	
	
}
