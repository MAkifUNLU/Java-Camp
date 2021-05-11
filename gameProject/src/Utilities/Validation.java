package Utilities;

import Entities.Gamer;

public class Validation {
	public static boolean validate(Gamer gamer) {
		if(gamer.getNationalityId().length() > 11) {
			return false;
		}
		else if(gamer.getNationalityId().length() > 10 
				&& gamer.getNationalityId().length() <= 11 
				&& !gamer.getNationalityId().startsWith("0")) {
			return true;
		}
		else {
			return false;
		}	
	}
}
