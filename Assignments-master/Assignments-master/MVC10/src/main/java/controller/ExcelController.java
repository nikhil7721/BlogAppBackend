package controller;

import java.util.ArrayList;
import java.util.List;
 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
 

 
@Controller
public class ExcelController {
 
 @RequestMapping(value = "/generate/excel.htm", method = RequestMethod.GET)
 ModelAndView generateExcel(HttpServletRequest request,
   HttpServletResponse response) throws Exception {
  System.out.println("Calling generateExcel()...");
  
  Employee yashwant = new Employee();
  yashwant.setEmployeeId(1);
  yashwant.setFirstName("Yashwant");
  yashwant.setLastName("Chavan");
  yashwant.setSalary(20000);
  
  Employee mahesh = new Employee();
  mahesh.setEmployeeId(2);
  mahesh.setFirstName("Mahesh");
  mahesh.setLastName("Patil");
  mahesh.setSalary(10000);
  
  List employees = new ArrayList();
  employees.add(yashwant);
  employees.add(mahesh);
  
  ModelAndView modelAndView = new ModelAndView("excelView", "employees",employees);
  
  return modelAndView;
 }
}
