package com.pluralsight.sercvice;

import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

public class CustomerServiceImlp implements CustomerService {
	
	private CustomerRepository customerRepository;
	public CustomerServiceImlp() {
		
	}
	
	public CustomerServiceImlp(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}


	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

}
