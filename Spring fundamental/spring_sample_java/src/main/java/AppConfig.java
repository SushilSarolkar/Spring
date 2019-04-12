import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
import com.pluralsight.sercvice.CustomerService;
import com.pluralsight.sercvice.CustomerServiceImlp;

@Configuration
@ComponentScan({"com.pluralsight"})
public class AppConfig {
	//setter injection
	
	 // @Bean("customerService")
	//  public CustomerService getCustomerService(){
	  //CustomerServiceImlp service=new CustomerServiceImlp();
	  //no need of below line if u used @autowire in customerServiceImpl on member
	 // service.setCustomerRepository(getCustomerRepository());
	 // return service;
	//  }
	 
	//constructor injection
	/*
	 * @Bean("customerService") public CustomerService getCustomerService(){
	 * CustomerServiceImlp service=new CustomerServiceImlp(getCustomerRepository());
	 * 
	 * return service; }
	 */
	
	//@Bean("customerRepository")
	//public CustomerRepository getCustomerRepository() {
	//	return new HibernateCustomerRepositoryImpl();
	//}

}
