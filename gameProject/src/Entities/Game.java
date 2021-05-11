package Entities;

import Abstracts.CampaignService;
import Abstracts.Entity;
import Concretes.CampaignManager;

public class Game implements Entity {
	private int id;
	private String name;
	private String category;
	private int price;
	private int discountRate;
	//private int priceAfterDiscount;
	
	
	
	
	public Game() {
		
	}

	public Game(int id, String name, String category, int price, int discountRate) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.discountRate = discountRate;
		//this.priceAfterDiscount = priceAfterDiscount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	
	public int getPriceAfterDiscount() {
		return price - (price * discountRate / 100);
	}

}
