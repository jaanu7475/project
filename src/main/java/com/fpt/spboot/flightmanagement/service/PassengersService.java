package com.fpt.spboot.flightmanagement.service;

import java.util.List;
import javax.management.RuntimeErrorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.fpt.spboot.flightmanagement.dao.MemberTableDAO;

import com.fpt.spboot.flightmanagement.entity.Member_table;

@Service
public class PassengersService {
	@Autowired
	MemberTableDAO memberTableDAO;

	public void setMemberTableDAO(MemberTableDAO memberTableDAO) {
		this.memberTableDAO = memberTableDAO;
	}

	@Transactional(readOnly = true)
	public List<Member_table> getAllMembers() {
		List<Member_table> member = memberTableDAO.findAll();
		if (member.size() > 0)
			return member;
		throw new RuntimeException("Not Found");
	}

	@Transactional
	public boolean addOrModifyMemberTable(Member_table membertab) {
		Member_table members=memberTableDAO.save(membertab);
		if(members!=null)
			return true;
		throw new RuntimeException("Not Modified");
	}
	
}
