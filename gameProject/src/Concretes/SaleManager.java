package Concretes;

import Abstracts.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService{

	@Override
	public void buy(Gamer gamer, Game game, Campaign campaign) {
		
		System.out.println(gamer.getFirstName() + " " + game.getName() + " " + " bought the game");
		System.out.println(game.getPriceAfterDiscount() + " $ paid");
	}

	@Override
	public void refund(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(gamer.getFirstName() + " " + game.getName() + " " + " returned the game");
		System.out.println(game.getPriceAfterDiscount() + " $ returned");
		
	}	

}
