package com.ksko.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ksko.dao.SubwayLogDao;
import com.ksko.domain.SubwayLog;

@Service
public class SubwayLogBiz {

	@Autowired
	SubwayLogDao subwayLogDao;
	
	public Page<SubwayLog> subwayLogListByStation(Pageable pageable, String station) {
		
		Page<SubwayLog> page = subwayLogDao.subwayLogListByStation(pageable, station);
		
		return page;
		
	}
}
