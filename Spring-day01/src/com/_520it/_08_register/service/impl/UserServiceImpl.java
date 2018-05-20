package com._520it._08_register.service.impl;

import org.apache.ibatis.session.SqlSession;

import com._520it._08_register.mapper.UserMapper;
import com._520it._08_register.service.IUserService;
import com._520it._08_register.util.MyBatisUtil;

public class UserServiceImpl implements IUserService {

	@Override
	public void register(String username, String password) {
		SqlSession session = MyBatisUtil.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		mapper.register(username, password);
		session.commit();
		session.close();

	}

}
