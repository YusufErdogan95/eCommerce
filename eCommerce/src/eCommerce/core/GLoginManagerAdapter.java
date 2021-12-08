package eCommerce.core;

import eCommerce.entities.concrete.User;
import eCommerce.google.GoogleLoginManager;

public class GLoginManagerAdapter implements GLoginService {

	GoogleLoginManager gooleLoginManager = new GoogleLoginManager();

	@Override
	public void logIn(User user) {
		
		gooleLoginManager.logIn(user.getUserMail(),user.getUserPassword() );
	}

	@Override
	public void signUp(User user) {
		gooleLoginManager.signUp(user.getUserMail(), user.getUserPassword());
	}
	
	}


