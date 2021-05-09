package Concretes;

import Abstracts.BaseCustomerManager;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{
	@Override
    public void Save(Customer customer) {
        System.out.println(customer.getFirstName()+ " saved to db");
    }
}
