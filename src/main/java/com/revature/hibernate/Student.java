package com.revature.hibernate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private Integer id;
	private String name;
	private Integer marks;
	@OneToOne(cascade=CascadeType.ALL,targetEntity=Subject.class)
	@JoinColumn(name="subjectId")
	private Subject subject;
	public Student(Integer id, String name, Integer marks, Subject subject) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.subject = subject;
	}
	
	public Student(Integer id, String name, Integer marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public Student() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", subject=" + subject + "]";
	}

	
}
