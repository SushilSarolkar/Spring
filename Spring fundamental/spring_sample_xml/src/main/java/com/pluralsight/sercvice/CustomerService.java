package com.pluralsight.sercvice;

import java.util.List;

import com.pluralsight.model.Customer;

public interface CustomerService {

	List<Customer> findAll();

}