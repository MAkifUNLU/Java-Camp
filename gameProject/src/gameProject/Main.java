package gameProject;

import java.util.Date;

import Concretes.CampaignManager;
import Concretes.GameManager;
import Concretes.GamerManager;
import Concretes.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Utilities.Validation;

public class Main {

	public static void main(String[] args) {
		
		   Campaign campaign1 = new Campaign(1," White Friday ",15);
		   Campaign campaign2 = new Campaign(2," New Year ",10);
		   Campaign campaign3 = new Campaign(3," Halloween ",20);
	       
	       Gamer gamer1 = new Gamer(1," Akif "," Ünlü ",new Date(2000,01,01),"12345678910");
	       Gamer gamer2 = new Gamer(2," Ahmet "," Sait ",new Date(2008,03,07),"12345678911");
	       Gamer gamer3 = new Gamer();
	       
	       Game game1 = new Game(1," PUBG "," War Game ",100,10);
	       Game game2 = new Game(2," Brawl Stars "," Kids Game ",200,15);
	       Game game3 = new Game(3," Age of Empires "," War Game ",300,15);
	       Game game4 = new Game(4," Monopoly "," Table Game ",400,20);
	      
	       
	       CampaignManager campaignManager = new CampaignManager();
	       GamerManager gamerManager = new GamerManager(new Validation());
	       GameManager gameManager = new GameManager();
	       SaleManager saleManager = new SaleManager();
	         	     
	       System.out.println("********Gamer*******");
	       gamerManager.add(gamer1);
	      // gamerManager.add(gamer3);//customer is not valid hatasý verilecek;
	       gamerManager.update(gamer2);
	       gamerManager.delete(gamer2);
	       
	       System.out.println("********Campaign*******");
	       campaignManager.add(campaign1);
	       campaignManager.delete(campaign2);
	       campaignManager.update(campaign3);
	       
	       System.out.println("********Game*******");
	       gameManager.add(game1);
	       gameManager.delete(game2);
	       gameManager.update(game2);
	       
	       System.out.println("********Sale*******");
	       saleManager.buy(gamer1, game1, campaign1);
	       saleManager.refund(gamer2,game2,campaign2);

	}

}
