package com._520it._08_register.mapper;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {

	void register(@Param("username")String username,
			@Param("password")String password);
}
