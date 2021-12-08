package eCommerce;

import eCommerce.business.abstracts.UserService;

import eCommerce.business.concrete.EmailManager;
import eCommerce.business.concrete.UserManager;
import eCommerce.business.concrete.UserValidationManager;
import eCommerce.core.GLoginManagerAdapter;
import eCommerce.core.GLoginService;
import eCommerce.dateAccsess.concrete.HibernateUserDao;
import eCommerce.entities.concrete.User;

public class Main {

	public static void main(String[] args) {
		
		UserService userService = new UserManager(new HibernateUserDao(),new EmailManager(), new UserValidationManager() {
			
			
		});
		GLoginService gLoginService = new GLoginManagerAdapter();
		
		User user1 = new User(1, "yusuf", "erd", "ysf@gmail.com", "123456");
		User user2 =new User(2,"Faruk"," özgün", "faruk@gmail.com","456789");
		User user3 = new User(3, "Furkan", "oðuz", "furkan@gmail.com", "4567777");

		
		userService.signUp(user1);
		userService.signUp(user2);
		gLoginService.signUp(user3);
		userService.logIn(user1);

	}

}
