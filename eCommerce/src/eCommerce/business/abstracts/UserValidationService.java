package eCommerce.business.abstracts;

import eCommerce.entities.concrete.User;

public interface UserValidationService {

	
	boolean name_passwordValidate(User user);
	boolean eMailValidate(User user);
	boolean validate(User user);
}
