package com.revature.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
//@NamedQueries({@NamedQuery(name="selectId",query="select e.empId from Employee e"),
//@NamedQuery(name="selectName",query="select e.EmpName from Employee e")})
public class Employee {
	@Id
	private Integer empId;
	@Column(name="EmpName",nullable=false)
	private String name;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}
	
}
