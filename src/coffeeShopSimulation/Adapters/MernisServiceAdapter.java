package coffeeShopSimulation.Adapters;

import coffeeShopSimulation.Abstract.CustomerCheckService;
import coffeeShopSimulation.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import java.rmi.RemoteException;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) throws RemoteException  {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		return kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getName().toUpperCase(), customer.getSurname().toUpperCase(), customer.getBirthday().getYear());
	}

}
