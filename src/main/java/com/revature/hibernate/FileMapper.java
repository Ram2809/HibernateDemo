package com.revature.hibernate;

public class FileMapper {
	public static FileEntity mapFileDetails(FileModel fileModel)
	{
		FileEntity fe=new FileEntity();
		fe.setId(fileModel.getId());
		fe.setUserName(fileModel.getUserName());
		fe.setImage(fileModel.getImage());
		return fe;
	}
}
