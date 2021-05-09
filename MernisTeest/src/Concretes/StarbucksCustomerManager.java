package Concretes;

import Abstracts.BaseCustomerManager;
import Abstracts.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	private ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	 @Override
	    public void Save(Customer customer) {
	        //CustomerCheckManager checkManager = new CustomerCheckManager();
	        if(customerCheckService.checkIfRealPerson(customer)) {
	            System.out.println(customer.getFirstName()+ " saved to db");
	        }
	        else {
	            System.out.println("Failed to save to db due to invalid person");
	        }

	    }
}
