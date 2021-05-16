package coffeeShopSimulation.Abstract;

import java.rmi.RemoteException;

import coffeeShopSimulation.Entities.Customer;

public abstract class BaseCustomerService implements CustomerService {
	
	@Override
	public void save (Customer customer) throws RemoteException {
		System.out.println("Saved to db " + customer.getName());
	}
	

}
