package interfaceAbstractDemo;

public class StarbucksCustomerManager extends CustomerManager
{
	private PersonCheckService _personCheckService;
	public StarbucksCustomerManager(PersonCheckService personCheckService) 
	{
		_personCheckService = personCheckService;
	}
	
	
	public void save(Customer customer) 
	{
		if(_personCheckService.checkIfRealPerson(customer))
		{
			this.save(customer);
		}
		else
		{
			System.out.println("Gecerli Bir Kisi Degil");
		}
		
	}
	
	
}
