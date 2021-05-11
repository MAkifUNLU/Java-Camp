package Abstracts;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface SaleService {
	void buy(Gamer gamer, Game game, Campaign campaign);
	void refund(Gamer gamer, Game game, Campaign campaign);
}
