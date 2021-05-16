package coffeeShopSimulation.Concrete;

import java.rmi.RemoteException;

import coffeeShopSimulation.Abstract.BaseCustomerService;
import coffeeShopSimulation.Abstract.CustomerCheckService;
import coffeeShopSimulation.Entities.Customer;

public class StarbucksCustomerService extends BaseCustomerService {
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerService(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) throws RemoteException {
		
		if(customerCheckService.checkIfRealPerson(customer))
		{
		super.save(customer);
		}
		else
		{
			System.out.println("Not a valid person");
		}
		}
	}


