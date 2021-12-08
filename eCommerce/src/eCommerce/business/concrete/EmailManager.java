package eCommerce.business.concrete;

import java.util.ArrayList;
import java.util.List;

import eCommerce.business.abstracts.EmailService;
import eCommerce.entities.concrete.User;

public class EmailManager implements EmailService {

	List<String> verificatedEmails = new ArrayList<String>();

	@Override
	public void sendEmail(User user, String userMail) {
		System.out.println("gönderilen e-postayý doðrulayýn"+user.getUserMail());
		
	}

	@Override
	public void verifyEmail(String userMail) {
		verificatedEmails.add(userMail);
		
	}

	@Override
	public boolean isVerificatedEmail(String userMail) {
		if(verificatedEmails.contains(userMail)) {
			return true;
		}
		return false;
	}
	
	


}
