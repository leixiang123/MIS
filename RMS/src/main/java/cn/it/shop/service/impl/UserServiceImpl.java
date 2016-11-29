package cn.it.shop.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.it.shop.model.User;
import cn.it.shop.service.UserService;
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

	@Override
	public List<User> queryUser(String name, int page, int rows) {
		return userDao.queryUser(name, page, rows);
	}
}
