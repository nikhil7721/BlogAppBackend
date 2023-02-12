package mvc8;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


 

 
@Controller
@RequestMapping("/employee/add.htm")
public class EmployeeController {
 @RequestMapping(method = RequestMethod.GET)
 ModelAndView add(HttpServletRequest request, HttpServletResponse response)
   throws Exception {
  EmployeeController employee = new EmployeeController();
  return new ModelAndView("addemployee", "employee", employee);
 
 }
}
