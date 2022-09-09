package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();

	@Override
	public boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {

		boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong(customer.nationalityId),
				customer.firstname.toUpperCase(), customer.lastname.toUpperCase(), customer.dateOfBirth.getYear());

		return result;
	}
}
