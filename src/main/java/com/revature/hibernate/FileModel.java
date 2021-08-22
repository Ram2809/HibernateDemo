package com.revature.hibernate;

import java.util.Arrays;

public class FileModel {
	private Integer id;
	private String userName;
	private byte[] image;
	public FileModel(Integer id, String userName, byte[] image) {
		super();
		this.id = id;
		this.userName = userName;
		this.image = image;
	}
	public FileModel() {
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
		return "FileModel [id=" + id + ", userName=" + userName + ", image=" + Arrays.toString(image) + "]";
	}
	
}
