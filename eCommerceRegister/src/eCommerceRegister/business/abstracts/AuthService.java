package eCommerceRegister.business.abstracts;

import eCommerceRegister.entities.concretes.LoginDto;
import eCommerceRegister.entities.concretes.User;

public interface AuthService {
	void register(User user);
	void verify(User user,String token);
	boolean userExists(String email);
	void login(LoginDto dto);
}
