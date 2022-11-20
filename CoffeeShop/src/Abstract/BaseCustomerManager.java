package Abstract;

import java.rmi.RemoteException;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException {
		System.out.println("Save to database: " + customer.firstname);
	}
}
