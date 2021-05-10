package eCommerceRegister.core.googleEmail;

import eCommerceRegister.core.EmailService;
import eCommerceRegister.googleMail.GoogleMailManager;

public class GoogleMailManagerAdapter implements EmailService{
	
private GoogleMailManager googleMailManager;
	
	public GoogleMailManagerAdapter() {
		super();
		this.googleMailManager = new GoogleMailManager();
	}
	@Override
	public void send(String email, String message) {
		googleMailManager.send(email, message);
		
	}

}
