package eCommerce.business.concrete;

import eCommerce.business.abstracts.EmailService;
import eCommerce.business.abstracts.UserService;
import eCommerce.business.abstracts.UserValidationService;
import eCommerce.dateAccsess.abstracts.UserDao;
import eCommerce.entities.concrete.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	private EmailService eMailService;
	private UserValidationService userValidationService;
	
	
	
	
	public UserManager(UserDao userDao, EmailService eMailService, UserValidationService userValidationService) {
		super();
		this.userDao = userDao;
		this.eMailService = eMailService;
		this.userValidationService = userValidationService;
	}

	
	@Override
	public void logIn(User user) {
		
		
		
				
		eMailService.verifyEmail(user.getUserMail());  

		if (userDao.getMail(user.getUserMail()) && userDao.getPassword(user.getUserMail())
				&& eMailService.isVerificatedEmail(user.getUserMail()) == true) {
			System.out.println("giriþ baþarýlý");

		} else if (eMailService.isVerificatedEmail(user.getUserMail()) == false) {
			System.out.println("giriþ baþarýsýz");
		} else {
			System.out.println(" girilen bilgileri kontrol ediniz");
		}
		
	}

	@Override
	public void signUp(User user) {
		
		if (userValidationService.validate(user) == true) {
			System.out.println(user.getUserLastName() + " " + user.getUserLastName() + " "+"kayýt alýndý");
			eMailService.sendEmail(user, user.getUserMail());
			userDao.add(user);
	}
		
		
	}

}
