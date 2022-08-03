package com.fpt.spboot.flightmanagement.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
//@Table(name="member_table")
public class Member_table {
	@Id
	@Column(name = "Member_Name")
	private String memberName;

	@Column(name = "Member_Password")
	private String memberPassword;

	@Column(name = "Member_mobile")
	private double memberMobile;

	@Column(name = "Member_Idproof")
	private double memberIdproof;
	
	public Member_table() {}

	public Member_table(String memberName, String memberPassword, double memberMobile, double memberIdproof) {
		super();
		this.memberName = memberName;
		this.memberPassword = memberPassword;
		this.memberMobile = memberMobile;
		this.memberIdproof = memberIdproof;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberPassword() {
		return memberPassword;
	}

	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}

	public double getMemberMobile() {
		return memberMobile;
	}

	public void setMemberMobile(double memberMobile) {
		this.memberMobile = memberMobile;
	}

	public double getMemberIdproof() {
		return memberIdproof;
	}

	public void setMemberIdproof(double memberIdproof) {
		this.memberIdproof = memberIdproof;
	}

	

	
}
