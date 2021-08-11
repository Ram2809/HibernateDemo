package com.revature.hibernate;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Associates")
public class Associates {
	@Id
	private Integer assoicateId;
	private String associateName;
	@OneToMany(targetEntity = Course.class)
	@JoinTable(name = "Ass_Cource")
	private Set<Course> courses;

	public Integer getAssoicateId() {
		return assoicateId;
	}

	public void setAssoicateId(Integer assoicateId) {
		this.assoicateId = assoicateId;
	}

	public String getAssociateName() {
		return associateName;
	}

	public void setAssociateName(String associateName) {
		this.associateName = associateName;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Associates [assoicateId=" + assoicateId + ", associateName=" + associateName + ", courses=" + courses
				+ "]";
	}

}
