package com.app.batch13springboot.controller;

import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BerandaController {

	@RequestMapping("/beranda")
	public String name() {
		return "/Beranda";
	}
	
	@PostMapping("/post")
	public String post() {
		return null;
	}
}
