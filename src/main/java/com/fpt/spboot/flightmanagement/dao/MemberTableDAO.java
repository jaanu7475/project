package com.fpt.spboot.flightmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.fpt.spboot.flightmanagement.entity.Member_table;

public interface MemberTableDAO extends JpaRepository<Member_table, String> {

}
