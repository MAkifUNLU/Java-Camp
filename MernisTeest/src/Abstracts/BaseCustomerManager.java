package Abstracts;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{

	@Override
	public void Save(Customer customer) {
		 System.out.println("Veritaban�na kaydedildi"+customer.getFirstName());
		
	}

}
