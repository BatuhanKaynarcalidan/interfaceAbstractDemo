package interfaceAbstractDemo;

public class MernisServiceAdapter implements PersonCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return false;
	}

}
