package Concretes;

import Abstracts.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " : successfully added");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + " : successfully deleted");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " : successfully updated");
		
	}

}
