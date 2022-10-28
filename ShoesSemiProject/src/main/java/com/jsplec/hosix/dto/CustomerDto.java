package com.jsplec.hosix.dto;

public class CustomerDto {
	String cId;
	String cPw;
	String cName;
	String cTelno;
	String cEmail;
	String cAddress;
	String cIndate;
	String cOutdate;
	
	public CustomerDto() {
		// TODO Auto-generated constructor stub
	}

	public CustomerDto(String cId, String cPw, String cName, String cTelno, String cEmail, String cAddress,
			String cIndate, String cOutdate) {
		super();
		this.cId = cId;
		this.cPw = cPw;
		this.cName = cName;
		this.cTelno = cTelno;
		this.cEmail = cEmail;
		this.cAddress = cAddress;
		this.cIndate = cIndate;
		this.cOutdate = cOutdate;
	}
	

	public CustomerDto(String cId, String cPw) {
		super();
		this.cId = cId;
		this.cPw = cPw;
	}

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public String getcPw() {
		return cPw;
	}

	public void setcPw(String cPw) {
		this.cPw = cPw;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcTelno() {
		return cTelno;
	}

	public void setcTelno(String cTelno) {
		this.cTelno = cTelno;
	}

	public String getcEmail() {
		return cEmail;
	}

	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}

	public String getcAddress() {
		return cAddress;
	}

	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}

	public String getcIndate() {
		return cIndate;
	}

	public void setcIndate(String cIndate) {
		this.cIndate = cIndate;
	}

	public String getcOutdate() {
		return cOutdate;
	}

	public void setcOutdate(String cOutdate) {
		this.cOutdate = cOutdate;
	}
	
	

}
