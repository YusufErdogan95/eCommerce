package eCommerce.business.abstracts;

import eCommerce.entities.concrete.User;

public interface UserService {

	void logIn (User user);
	void signUp (User user);
	
}
