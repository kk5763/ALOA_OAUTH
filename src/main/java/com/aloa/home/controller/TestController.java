package com.aloa.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aloa.home.dto.HomeVO;
import com.aloa.home.mapper.HomeMapper;
import com.aloa.home.service.HomeService;

@RestController
public class TestController {
	@Autowired
	HomeService homeService;
	
	@Autowired
	HomeMapper homeMapper;
	
	@RequestMapping("/{name}")
	public HomeVO home(@PathVariable String name) throws Exception{
		HomeVO home = homeMapper.inspectEmail(name);
		return home;
	}
}