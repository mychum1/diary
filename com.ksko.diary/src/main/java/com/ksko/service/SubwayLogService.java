package com.ksko.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ksko.biz.SubwayLogBiz;
import com.ksko.domain.SubwayLog;

@Service
public class SubwayLogService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	SubwayLogBiz subwayLogBiz;
	
	public Page<SubwayLog> subwayLogListByStation(Pageable pageable, String station) {
		logger.info("call searchSubwayLogPage");
		
		Page<SubwayLog> page = subwayLogBiz.subwayLogListByStation(pageable, station);
		
		return page;
	}
}
