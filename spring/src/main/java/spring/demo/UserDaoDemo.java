package spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.dao.UserDao;

public class UserDaoDemo {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userDao  = (UserDao) app.getBean("userDao");
		userDao.save();
	}
}