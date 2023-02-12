package generics;

import java.util.HashSet;
import java.util.Set;

class Employee
{
	private String name;
	private int age;
	private int salary;

	public Employee(String name, int age, int salary)
	{
		this.name = name;
		this.age = age;
		this.setSalary(salary);
	}

	@Override
	public String toString()
	{
		return "{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}

class Main
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee("Rav", 20, 20000);
		Employee e2 = new Employee("Jay", 28, 30000);

		Set<Employee> employees = new HashSet<>();
		employees.add(e1);
		employees.add(e2);

		System.out.println(employees);
	}
}