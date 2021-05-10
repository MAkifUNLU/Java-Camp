package eCommerceRegister;
import java.util.List;

import eCommerceRegister.business.abstracts.UserService;
import eCommerceRegister.business.concretes.AuthManager;
import eCommerceRegister.business.concretes.UserManager;
import eCommerceRegister.core.amazonEmail.AmazonMailManagerAdapter;
import eCommerceRegister.core.googleEmail.GoogleMailManagerAdapter;
import eCommerceRegister.dataAccess.concretes.HibernateUserDao;
import eCommerceRegister.dataAccess.concretes.InMemoryUserDao;
import eCommerceRegister.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		InMemoryUserDao inMemoryUserDao=new InMemoryUserDao();
		AuthManager authManager=new AuthManager(new UserManager(inMemoryUserDao, 
				new AmazonMailManagerAdapter()));
			
		User akif=new User(2,"Akif","Ünlü","ako@gmail.com","123456",true);
		User ahmet=new User(2,"Ahmet","Sait","aho@gmail.com","123456",true);
		
		
		authManager.register(akif);
		
		UserManager userManager=new UserManager(inMemoryUserDao, new GoogleMailManagerAdapter());
		//userManager.update(ahmet);
		//userManager.delete(3);
		userManager.getAll();
		
		
	}

}
