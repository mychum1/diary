package com.ksko.domain;

import java.io.Serializable;

public class SubwayLog implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1102561747960995370L;

	private String writer;
	
	private String subject;
	
	private String writeDate;
	
	private Integer sum;
	
	private String review;
	
	private boolean IsPast;
	
	private String contents;

	private Integer stationNo;
	
	

	public Integer getStationNo() {
		return stationNo;
	}

	public void setStationNo(Integer stationNo) {
		this.stationNo = stationNo;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public boolean isIsPast() {
		return IsPast;
	}

	public void setIsPast(boolean isPast) {
		IsPast = isPast;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}
	
	
}
