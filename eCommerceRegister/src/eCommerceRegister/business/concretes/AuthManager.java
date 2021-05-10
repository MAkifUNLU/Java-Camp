package eCommerceRegister.business.concretes;

import eCommerceRegister.business.abstracts.AuthService;
import eCommerceRegister.business.abstracts.UserService;
import eCommerceRegister.core.utils.Utils;
import eCommerceRegister.entities.concretes.LoginDto;
import eCommerceRegister.entities.concretes.User;

public class AuthManager implements AuthService{
	
	private UserService userService;

	public AuthManager(UserService userService) {
		super();
		this.userService = userService;
	}
	
	public boolean userValidate(User user) {
		if (user != null && !user.getFirstName().isEmpty() && !user.getLastName().isEmpty()
				&& !user.getEmail().isEmpty() && !user.getPassword().isEmpty()) {
			return true;
		}
		return false;
	}

	public boolean passwordValidate(String password) {

		if (password.length() >= 6) {
			return true;
		} else {
			System.out.println("Your password must be at least 6 characters.");
			return false;
		}
	}

	@Override
	public void register(User user) {
		if (userValidate(user) && passwordValidate(user.getPassword()) && userExists(user.getEmail()) == false
				&& Utils.emailValidate(user.getEmail())) {

			userService.add(user);
			System.out.println("Registration successful");
		} else {
			System.out.println("Registration failed");
		}
	}

	@Override
	public void verify(User user, String token) {
		if (user != null && token.length() > 20) {
			User exitsUser = userService.get(user.getEmail());
			exitsUser.setVerify(true);

			userService.update(exitsUser);
			System.out.println("Verified");
		} else {
			System.out.println("Not verified");
		}
	}

	@Override
	public boolean userExists(String email) {
		User user = userService.get(email);

		if (user == null) {
			return false;
		} else {
			System.out.println("Email available." + email);
			return true;
		}
	}

	@Override
	public void login(LoginDto dto) {
		User user = userService.get(dto.getEmail());

		if (user != null && user.getPassword().equals(dto.getPassword())) {
			
			System.out.println("Login successful");

		}else {
			System.out.println("Username or password incorrect");
		}
		
	}

}
