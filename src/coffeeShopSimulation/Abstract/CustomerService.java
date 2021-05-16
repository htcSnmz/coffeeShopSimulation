package coffeeShopSimulation.Abstract;

import java.rmi.RemoteException;

import coffeeShopSimulation.Entities.Customer;

public interface CustomerService {
	void save (Customer customer) throws RemoteException;

}
