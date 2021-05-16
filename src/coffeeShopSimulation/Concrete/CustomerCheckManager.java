package coffeeShopSimulation.Concrete;

import coffeeShopSimulation.Abstract.CustomerCheckService;
import coffeeShopSimulation.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
	}

}
