package com.dj.springboot.mapper;

public class UserMapperSQL {

	public String findUserByIdd(Integer idd) {
		return "select * from user where id = " + idd;
	}
}
