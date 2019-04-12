import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.sercvice.CustomerService;

public class Application {

	public static void main(String[] args) {
		
		/* CustomerService customerService=new CustomerServiceImlp(); */
		ApplicationContext appContext=new ClassPathXmlApplicationContext("applicatioContext.xml");
		CustomerService service=appContext.getBean("customerService", CustomerService.class);
		System.out.println(service);		
		System.out.println(service.findAll().get(0).getFirstName());
	}

}
