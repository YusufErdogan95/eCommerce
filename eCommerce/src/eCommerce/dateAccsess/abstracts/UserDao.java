package eCommerce.dateAccsess.abstracts;

import java.util.List;

import eCommerce.entities.concrete.User;


public interface UserDao {


     void add(User user);
     void delete (User user);
     void update (User user);
     boolean getMail(String userMail);
     boolean getPassword(String userPassword);
     List<User> getAll();
	
}