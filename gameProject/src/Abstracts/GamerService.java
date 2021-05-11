package Abstracts;

import Entities.Gamer;

public interface GamerService {
	void add(Gamer gamer);
	void delete(Gamer gamer);
	void update(Gamer gamer);
	
	void signUp(Gamer gamer);
	void signIn(Gamer gamer);
	void signOut(Gamer gamer);
}
