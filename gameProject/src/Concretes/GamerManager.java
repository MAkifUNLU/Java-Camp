package Concretes;

import Abstracts.GamerService;
import Entities.Gamer;
import Utilities.Validation;

public class GamerManager implements GamerService{
	
	Validation validation;
	
	public GamerManager(Validation validation) {
		super();
		this.validation = validation;
	}

	@Override
	public void add(Gamer gamer) {
		if(validation.validate(gamer)) {
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " : successfully added");
		}else {
			System.out.println("customer is not valid ");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " : successfully deleted");
	}

	@Override
	public void update(Gamer gamer) {
		
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " : successfully updated");
	}

	@Override
	public void signUp(Gamer gamer) {
		
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " : successfully sign up");
	}

	@Override
	public void signIn(Gamer gamer) {

		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " : successfully sign in");
	}

	@Override
	public void signOut(Gamer gamer) {

		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " : successfully sign out");
	}

}
