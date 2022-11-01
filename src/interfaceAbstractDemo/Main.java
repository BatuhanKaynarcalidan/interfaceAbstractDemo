package interfaceAbstractDemo;

public class Main {

	public static void main(String[] args) 
	{
		CustomerManager customerManager = new StarbucksCustomerManager(new PersonCheckService() {
			
			@Override
			public boolean checkIfRealPerson(Customer customer) {
				// TODO Auto-generated method stub
				return false;
			}
		});
		customerManager.save(new Customer(1, "Batuhan", "Kaynarcalidan","1231312312312"));

	}

}
