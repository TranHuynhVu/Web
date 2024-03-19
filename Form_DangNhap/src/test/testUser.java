package test;

import dao.UserDao;
import modol.User;

public class testUser {

	public static void main(String[] args) {
		User user = new User("abcde", "123");
		
		UserDao.getUserDao().insert(user);
		

	}

}
