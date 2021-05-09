package Main;


import java.util.Date;

import Abstracts.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concretes.NeroCustomerManager;
import Concretes.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer(1,"Mehmet Akif ","Ünlü",new Date(2000,1,1),"44818630486"));
		
		
	     	 
	}

}
