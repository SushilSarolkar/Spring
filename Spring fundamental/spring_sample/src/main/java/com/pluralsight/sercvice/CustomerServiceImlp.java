package com.pluralsight.sercvice;

import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImlp implements CustomerService {
	
	private CustomerRepository customerRepository=new HibernateCustomerRepositoryImpl();
	
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

}
