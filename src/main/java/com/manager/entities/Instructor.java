package com.manager.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Instructor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)//auto-incremnet
	private int id;
	
	@NotBlank(message = "Name must required !!")// if blank then message
	@Size(min =2 , max =20, message =" Charaters between 2-20 allowed !!")// character size defined
	private String iname;
	private String course;
	
	@Column(unique = true)
	private String email;
	private String password;
	
	private String role;
	private String imageurl;
	
	//for courses
	
	private int price;
	private String timeduration;
	private String courseimageurl;
	private String progresscourse;
	
	@Column(length = 300)
	private String aboutcourse;
	
	//for student
	@OneToMany (cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "stu")
	private List<Student> stu = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTimeduration() {
		return timeduration;
	}

	public void setTimeduration(String timeduration) {
		this.timeduration = timeduration;
	}

	public String getCourseimageurl() {
		return courseimageurl;
	}

	public void setCourseimageurl(String courseimageurl) {
		this.courseimageurl = courseimageurl;
	}

	public String getProgresscourse() {
		return progresscourse;
	}

	public void setProgresscourse(String progresscourse) {
		this.progresscourse = progresscourse;
	}

	public String getAboutcourse() {
		return aboutcourse;
	}

	public void setAboutcourse(String aboutcourse) {
		this.aboutcourse = aboutcourse;
	}

	public List<Student> getStu() {
		return stu;
	}

	public void setStu(List<Student> stu) {
		this.stu = stu;
	}

	public Instructor(int id,
			@NotBlank(message = "Name must required !!") @Size(min = 2, max = 20, message = " Charaters between 2-20 allowed !!") String iname,
			String course, String email, String password, String role, String imageurl, int price, String timeduration,
			String courseimageurl, String progresscourse, String aboutcourse, List<Student> stu) {
		super();
		this.id = id;
		this.iname = iname;
		this.course = course;
		this.email = email;
		this.password = password;
		this.role = role;
		this.imageurl = imageurl;
		this.price = price;
		this.timeduration = timeduration;
		this.courseimageurl = courseimageurl;
		this.progresscourse = progresscourse;
		this.aboutcourse = aboutcourse;
		this.stu = stu;
	}

	public Instructor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
