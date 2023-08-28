package com.mydetail.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@RequestMapping("/getname")
	public String getMyName() {
		return "Manonmanian";
	}
	@RequestMapping("/getprofession")
	public String getMyProfession() {
		return "developer";
	}
}
