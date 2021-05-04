package Concreate;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager {

	//enjekte diyoruz implement etmek terine solid prensibi!!!
	CustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService _customerCheckService) {
		super();
		this._customerCheckService = _customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
	
		if(_customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}else{
			System.out.println("Not a valid person");
		}
		;
		
		
	}

	



}
