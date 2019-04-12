import com.pluralsight.sercvice.CustomerService;
import com.pluralsight.sercvice.CustomerServiceImlp;

public class Application {

	public static void main(String[] args) {
		
		CustomerService customerService=new CustomerServiceImlp();
		System.out.println(customerService.findAll().get(0).getFirstName());
	}

}
