package eCommerce.business.concrete;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerce.business.abstracts.UserValidationService;
import eCommerce.entities.concrete.User;

public class UserValidationManager implements UserValidationService {
	
	List<String> listOfEmail = new ArrayList<String>();
	
	@Override
	public boolean validate(User user) {
		if (name_passwordValidate(user) && eMailValidate(user) == true) {
			return true;
		}
		return false;
	
	}
	
	@Override
	public boolean name_passwordValidate(User user) {
		if (user.getUserName().length()>=2 && user.getUserLastName().length()>=2 && user.getUserPassword().length()>=6) {
			return true;
		}else {
			
			System.out.println("belirtilen kriterlere göre giriş yapmadınız.");
			return false;
		}
		
	}

	@Override
	public boolean eMailValidate(User user) {
		final Pattern regexPattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
				Pattern.CASE_INSENSITIVE);
		Matcher matcher = regexPattern.matcher(user.getUserMail());
		if (matcher.find()) {

		} else {
			System.out.println("Email adresi geçersiz.");
			return false;
		}

		boolean result = true;
		if (listOfEmail.contains(user.getUserMail())) {
			System.out.println("Lütfen baþka bir e-mail adresi girin. Bu e-mail adresi kullanýlýyor.");
			return false;
		} else {
			result = true;
			listOfEmail.add(user.getUserMail());	
		}
		return result;
		
	}

	

	
}
