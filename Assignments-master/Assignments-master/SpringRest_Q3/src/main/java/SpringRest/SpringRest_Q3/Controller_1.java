package SpringRest.SpringRest_Q3;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class Controller {
	
	@Autowired
	Service service;
	
	@GetMapping("/{zipcode}")
	public Infor findDetails ( @PathVariable String zipcode ){
		return service.displayInformation( zipcode ); 
	}
	
	
	
	
	
}
