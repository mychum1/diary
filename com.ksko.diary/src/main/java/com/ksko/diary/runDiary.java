package com.ksko.diary;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class runDiary {

	@RequestMapping("/")
	public String main() {
		
		return "index";
	}
}
