package com.aloa.home.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aloa.home.dto.HomeVO;
import com.aloa.home.mapper.HomeMapper;

@Service
public class HomeService {
	
	@Autowired
	private HomeMapper homeMapper;
	
	public HomeVO inspectEmail(String name) throws Exception{
		HomeVO homeVO=homeMapper.inspectEmail(name);
		return homeVO;
	}
}
