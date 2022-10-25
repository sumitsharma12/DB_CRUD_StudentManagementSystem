package com.student.beans.student;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentVo {
	@Id
	private long id;
	private String name;
	private String address;
	private String email;
	private String contectNumber;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContectNumber() {
		return contectNumber;
	}
	public void setContectNumber(String contectNumber) {
		this.contectNumber = contectNumber;
	}
	public StudentVo(long id, String name, String address, String email, String contectNumber) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.contectNumber = contectNumber;
	}
	public StudentVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
