package com.revature.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Subject {
	@Id
	private Integer subId;
	private String subName;
	@OneToOne(mappedBy="subject")
	private Student student;
	
	public Subject() {
		super();
	}
	public Subject(Integer subId, String subName, Student student) {
		super();
		this.subId = subId;
		this.subName = subName;
		this.student = student;
	}
	
	public Subject(Integer subId, String subName) {
		super();
		this.subId = subId;
		this.subName = subName;
	}
	public Integer getSubId() {
		return subId;
	}
	public void setSubId(Integer subId) {
		this.subId = subId;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Subject [subId=" + subId + ", subName=" + subName + ", student=" + student + "]";
	}
	
}
