package com.revature.hibernate;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ImageDB")
public class Image {
	@Id
	private Integer imageId;
	private String userName;
	private byte[] image;
	
	public Image() {
		super();
	}

	public Image(Integer imageId, String userName, byte[] image) {
		super();
		this.imageId = imageId;
		this.userName = userName;
		this.image = image;
	}

	public Integer getImageId() {
		return imageId;
	}

	public void setImageId(Integer imageId) {
		this.imageId = imageId;
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
		return "Image [imageId=" + imageId + ", userName=" + userName + ", image=" + Arrays.toString(image) + "]";
	}
	
}
