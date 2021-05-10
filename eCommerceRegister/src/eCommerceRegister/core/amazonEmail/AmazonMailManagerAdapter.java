package eCommerceRegister.core.amazonEmail;

import eCommerceRegister.core.EmailService;

public class AmazonMailManagerAdapter implements EmailService{
	
	private AmazonMailManagerAdapter amazonMailManager;

	public AmazonMailManagerAdapter() {
		super();
		this.amazonMailManager = new AmazonMailManagerAdapter();
	}
	@Override
	public void send(String email, String message) {

		amazonMailManager.send(email, message);
		
	}

}
