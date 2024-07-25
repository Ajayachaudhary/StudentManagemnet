package com.manager.entities;

import java.security.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)//auto-incremnet
	private int sid;
	
	@NotBlank(message = "Name must required !!")// if blank then message
	@Size(min =2 , max =20, message =" Charaters between 2-20 allowed !!")// character size defined
	private String name;
	private String course;
	@Column(unique = true)
	private String email;
	private String grades;
	private String role;
	private String imageurl;
	private String payment;
	private boolean enrolled;
	@Column(length = 200)
	private String about;
	private String contactNo;
	private Timestamp DOB;
	
	@ManyToOne
	private Instructor ins;
	
	
	public Student(int sid,
			@NotBlank(message = "Name must required !!") @Size(min = 2, max = 20, message = " Charaters between 2-20 allowed !!") String name,
			String course, String email, String grades, String role, String imageurl, String payment, boolean enrolled,
			String about, String contactNo, Timestamp dOB, Instructor ins) {
		super();
		this.sid = sid;
		this.name = name;
		this.course = course;
		this.email = email;
		this.grades = grades;
		this.role = role;
		this.imageurl = imageurl;
		this.payment = payment;
		this.enrolled = enrolled;
		this.about = about;
		this.contactNo = contactNo;
		DOB = dOB;
		this.ins = ins;
	}


	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getGrades() {
		return grades;
	}


	public void setGrades(String grades) {
		this.grades = grades;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public String getImageurl() {
		return imageurl;
	}


	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}


	public String getPayment() {
		return payment;
	}


	public void setPayment(String payment) {
		this.payment = payment;
	}


	public boolean isEnrolled() {
		return enrolled;
	}


	public void setEnrolled(boolean enrolled) {
		this.enrolled = enrolled;
	}


	public String getAbout() {
		return about;
	}


	public void setAbout(String about) {
		this.about = about;
	}


	public String getContactNo() {
		return contactNo;
	}


	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}


	public Timestamp getDOB() {
		return DOB;
	}


	public void setDOB(Timestamp dOB) {
		DOB = dOB;
	}


	public Instructor getIns() {
		return ins;
	}


	public void setIns(Instructor ins) {
		this.ins = ins;
	}


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
}
