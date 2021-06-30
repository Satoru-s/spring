package test01.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test01.dao.UserDao;

public class UserDaoDemo {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userdao = (UserDao) app.getBean("userDao");
		userdao.save();
	}
}
