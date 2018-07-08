package com.chenzeshenga.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chenzeshenga.springboot.config.ConfigInfo;

@Controller
public class ConfigInfoController {

	@Value("${boot.name}")
	private String name;

	@Value("${boot.location}")
	private String location;

	@Autowired
	private ConfigInfo config;

	@RequestMapping("/boot/config")
	public @ResponseBody String config() {
		return name + " " + location + "--->" + config.getName() + " " + config.getLocation();
	}

}
