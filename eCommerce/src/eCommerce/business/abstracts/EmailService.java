package eCommerce.business.abstracts;

import eCommerce.entities.concrete.User;

public interface EmailService {

	public void sendEmail(User user, String userMail);
	public void verifyEmail(String userMail);
	public boolean isVerificatedEmail(String userMail);
	
}
