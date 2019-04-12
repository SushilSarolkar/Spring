package com.pluralsight.sercvice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImlp implements CustomerService {
	//@Autowired      //its member injection
	private CustomerRepository customerRepository;
	
	@Autowired          //its constructor injection
	public CustomerServiceImlp(CustomerRepository customerRepository) {
		System.out.println("we are using constructor injection");
		this.customerRepository = customerRepository;
	}

	//@Autowired		//its setter injection
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("we are using setter injection");
		this.customerRepository = customerRepository;
	}
	
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

}
