package com.ksko.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ksko.domain.StationUser;
import com.ksko.domain.SubwayLog;
import com.ksko.service.SubwayLogService;

@Controller
public class SubwayLogController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	SubwayLogService subwayLogService;

	@RequestMapping(value = "/subway/log/list/{station}", method = RequestMethod.GET)
	@ResponseBody
	public Page<SubwayLog> subwayLogListByStation(@PathVariable String station, 
			@PageableDefault(direction = Direction.DESC, size = 10)Pageable pageable,
			@RequestBody StationUser stationUser) {
		logger.info("call subwayLogList");
		
		Page<SubwayLog> page = subwayLogService.subwayLogListByStation(pageable, station);
		
		
		
		return page;
		
	}
	
}
