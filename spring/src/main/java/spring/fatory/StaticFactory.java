package spring.fatory;

import spring.dao.UserDao;
import spring.dao.impl.UserDaoImpl;

public class StaticFactory {
	public static UserDao getUserDao() {
		return new UserDaoImpl();
	}
}
