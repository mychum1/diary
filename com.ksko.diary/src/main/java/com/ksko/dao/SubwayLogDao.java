package com.ksko.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import com.ksko.domain.SubwayLog;

@Repository
public interface SubwayLogDao{

	public Page<SubwayLog> subwayLogListByStation(Pageable pageable, String station);
}
