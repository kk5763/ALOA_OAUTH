package com.aloa;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.aloa.home.mapper.UserMapper;
import com.aloa.home.user.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationTests {
	@Autowired
	UserMapper userMapper;
	
	@Test
	public void readUserTest(){
		User user = userMapper.readUser("ko");
		assertThat("ko", is(user.getUsername()));
		assertThat("YCU", is(user.getName()));
		assertThat("1234", is(user.getPassword()));
	}
	
	@Test
	public void readAuthorityTest(){
		List<String> authorities = userMapper.readAuthority("ko");
		assertThat(authorities, hasItems("ADMIN","USER"));
		
		authorities= userMapper.readAuthority("koo");
        assertThat(authorities, hasItem("USER"));
	}
	
}
