package coffeeShopSimulation.Abstract;

import java.rmi.RemoteException;

import coffeeShopSimulation.Entities.Customer;

public interface CustomerCheckService {
	
	boolean checkIfRealPerson(Customer customer) throws RemoteException;

}
