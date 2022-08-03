package com.fpt.spboot.flightmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fpt.spboot.flightmanagement.entity.Schedule_details;

public interface ScheduleDAO extends JpaRepository<Schedule_details, String> {

	/*@Query("select s from Schedule s where s.scheduleFrom=?1 and s.scheduleTo=?2 and s.scheduleDate=?3")
	public List<Schedule> findByScheduleFromAndScheduleToAndScheduleDate(String scheduleFrom,String scheduleTo,java.sql.Date scheduleDate);*/
}
