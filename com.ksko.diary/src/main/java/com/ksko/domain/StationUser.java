package com.ksko.domain;

import java.io.Serializable;

public class StationUser implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5130410545781792834L;

	private String Id;
	
	private Integer groupNo;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public Integer getGroupNo() {
		return groupNo;
	}

	public void setGroupNo(Integer groupNo) {
		this.groupNo = groupNo;
	}
	
	
	
}
