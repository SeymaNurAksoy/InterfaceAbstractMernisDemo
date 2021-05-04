import Abstract.BaseCustomerManager;
import Adapter.MernisServiceAdapter;
import Concreate.NeroCustomerManager;
import Concreate.StarbucksCustomerManager;
import Entities.Customer;


public class Main {

	public static void main(String[] args) {
		

		BaseCustomerManager  baseCustomerManager =  new StarbucksCustomerManager(new MernisServiceAdapter()); 
	
		baseCustomerManager.save(new Customer(1, "Engin", "Demiroð", 1986,43497667950l));
	}

}
