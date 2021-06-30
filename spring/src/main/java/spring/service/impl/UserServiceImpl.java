package spring.service.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.dao.UserDao;
import spring.service.UserService;

public class UserServiceImpl implements UserService{
	
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void save() {
		userDao.save();
	}

}
