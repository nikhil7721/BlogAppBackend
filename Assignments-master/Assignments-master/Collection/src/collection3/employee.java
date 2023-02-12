package collection3;

import java.util.*;
public class employee {
	private int id;
	private String name;
	private String department;
	private int salary;

	public employee(int id,String name,String department,int salary) {
		super();
		this.id=id;
		this.name = name;
		this.department=department;
		this.salary=salary;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String toString() {
		return "ID : "+id+" --------Name : "+name+" -------Department : "+department+" ---------Salary : "+salary;
	}
}
class MyNameComp implements Comparator<employee>{

	@Override
	public int compare(employee o1, employee o2) {
		
		
		return o1.getName().compareTo(o2.getName());
	}
	
}
class MyIdComp implements Comparator<employee>{

	@Override
	public int compare(employee o1, employee o2) {
		
		if(o1.getId()>o2.getId()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
}
class MyDepComp implements Comparator<employee>{

	@Override
	public int compare(employee o1, employee o2) {
		
		return o1.getDepartment().compareTo(o2.getDepartment());
	}
	
}
class MySalaryComp implements Comparator<employee>{

	@Override
	public int compare(employee o1, employee o2) {
		

		if(o1.getSalary()>o2.getSalary()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
}
