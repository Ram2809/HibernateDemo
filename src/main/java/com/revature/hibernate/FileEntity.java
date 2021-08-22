package com.revature.hibernate;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fileDemo")
public class FileEntity {
	@Id
	private Integer id;
	@Column(nullable=false)
	private String userName;
	@Column(nullable=false)
	private byte[] image;
	public FileEntity(Integer id, String userName, byte[] image) {
		super();
		this.id = id;
		this.userName = userName;
		this.image = image;
	}
	public FileEntity() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "FileEntity [id=" + id + ", userName=" + userName + ", image=" + Arrays.toString(image) + "]";
	}
	
}
