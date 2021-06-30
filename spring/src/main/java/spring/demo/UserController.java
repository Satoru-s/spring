package spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.service.UserService;
import spring.service.impl.UserServiceImpl;

public class UserController {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService) app.getBean("userService");
		userService.save();
	}
}
