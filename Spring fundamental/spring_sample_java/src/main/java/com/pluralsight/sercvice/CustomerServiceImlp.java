package com.pluralsight.sercvice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
@Service("customerService")
@Scope("singleton")
public class CustomerServiceImlp implements CustomerService {
	
	private CustomerRepository customerRepository;
	public CustomerServiceImlp() {
	}
	
	
	public CustomerServiceImlp(CustomerRepository customerRepository) {
		System.out.println("we are using constructor injection");
		this.customerRepository = customerRepository;
	}

	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("we are using setter injection");
		this.customerRepository = customerRepository;
	}


	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

}
