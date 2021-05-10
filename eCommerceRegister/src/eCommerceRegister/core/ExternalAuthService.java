package eCommerceRegister.core;

import eCommerceRegister.entities.concretes.LoginDto;

public interface ExternalAuthService {
	void register(String email);
	boolean userExists(String email);
	void login(LoginDto dto);
	
}
