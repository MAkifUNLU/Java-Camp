package Adapters;

import java.rmi.RemoteException;

import Abstracts.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;



public class MernisServiceAdapter implements ICustomerCheckService{

	  @Override
	    public boolean checkIfRealPerson(Customer customer)  {
	        KPSPublicSoapProxy client = new KPSPublicSoapProxy();
	        boolean result = true;
	        try {  
	        result = client.TCKimlikNoDogrula(
	                Long.parseLong(customer.getNationalityId()),
	                customer.getFirstName().toUpperCase(),
	                customer.getLastName().toUpperCase(),
	                customer.getDateOfBirth().getYear());
	        }
	        catch(RemoteException e ) {e.printStackTrace();}
	        return result;
	    }

	}