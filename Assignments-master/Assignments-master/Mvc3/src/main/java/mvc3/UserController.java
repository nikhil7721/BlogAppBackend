package mvc3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
	
	UserModel userModel = new UserModel();
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String sayHello() {
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String sayHelloWelcome(ModelMap model,@RequestParam String name, @RequestParam String password) {
		
		if(name.equals(userModel.userName) && password.equals(userModel.password)) {
			model.put("print", "Welcome");
			return "success";
		}else {
			return "error";
		}
		
	}

}
