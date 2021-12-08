package eCommerce.dateAccsess.concrete;

import java.util.ArrayList;
import java.util.List;

import eCommerce.dateAccsess.abstracts.UserDao;
import eCommerce.entities.concrete.User;

public class HibernateUserDao implements UserDao{
	
	
	List<User> users = new ArrayList<User>();
	
	

	@Override
	public void add(User user) {
		
		System.out.println("hibernate ile eklendi"+ user.getUserName());
		users.add(user);
	}

	@Override
	public void delete(User user) {
		System.out.println("hibernate ile silindi"+ user.getUserName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("hibernate ile ile güncellendi"+ user.getUserId());
		
	}

	@Override
	public boolean getMail(String userMail) {
    for   (User user : users) {
			if (user.getUserMail()==userMail) {
				return  true;
			}else {
				
			}
		}
	return false;
    
    }

	@Override
	public boolean getPassword(String userPassword) {
		
			for(User user : users) {
				if(user.getUserPassword() == userPassword) {
					return true;
				}
				
			}
			return false;
		
	}

	@Override
	public List<User> getAll() {
		for (User user : users) {
			System.out.println(user.getUserName());
		}
		return users;
	}

	
	
	
	
}
