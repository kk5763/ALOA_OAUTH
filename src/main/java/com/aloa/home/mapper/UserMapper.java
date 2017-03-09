package com.aloa.home.mapper;

import java.util.List;

import com.aloa.home.user.User;

public interface UserMapper {
	public User readUser(String username);
	public List<String> readAuthority(String username);
}
