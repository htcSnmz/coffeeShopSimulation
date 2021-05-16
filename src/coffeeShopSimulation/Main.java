package coffeeShopSimulation;

import java.rmi.RemoteException;
import java.util.Date;

import coffeeShopSimulation.Abstract.BaseCustomerService;
import coffeeShopSimulation.Adapters.MernisServiceAdapter;
import coffeeShopSimulation.Concrete.StarbucksCustomerService;
import coffeeShopSimulation.Entities.Customer;

public class Main {

	public static void main(String[] args) throws RemoteException{
		
		Customer customer = new Customer("Hatice", "Sönmez", new Date(1991,2,17), "11111111111");
		BaseCustomerService customerService = new StarbucksCustomerService(new MernisServiceAdapter());
		customerService.save(customer);
	}

}
