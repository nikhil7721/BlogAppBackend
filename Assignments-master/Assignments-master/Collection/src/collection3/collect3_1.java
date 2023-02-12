package collection3;

import java.util.*;
public class collect3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=4;i++) {
		System.out.println("\n\n-----In what sorted order details do you want----");
		System.out.println("1:ID\n2:Name\n3:Department\n4:Salary\n5:exit");
		System.out.println("\nEnter your choice: ");
		int n=sc.nextInt();
		
		switch(n) {
		case 1:
			TreeSet<employee> tree=new TreeSet<>(new MyIdComp());
			tree.add(new employee(23,"himanshu","ECE",40000));
			tree.add(new employee(12,"nikhil","ME",60000));
			tree.add(new employee(24,"akshay","ECE",30000));
			tree.add(new employee(21,"shamali","CE",40000));
			tree.add(new employee(19,"Aditya","CSE",40000));
			tree.add(new employee(9,"nilesh","CSE",50000));
			tree.add(new employee(34,"jishnu","ECE",70000));
			tree.add(new employee(13,"raju","ME",50000));
			//System.out.print(tree);
			for(employee e:tree) {
				System.out.println(e);
			}
			break;
		case 2:
			TreeSet<employee> tree1=new TreeSet<>(new MyNameComp());
			tree1.add(new employee(23,"himanshu","ECE",40000));
			tree1.add(new employee(12,"nikhil","ME",60000));
			tree1.add(new employee(24,"akshay","ECE",30000));
			tree1.add(new employee(21,"shamali","CE",40000));
			tree1.add(new employee(19,"Aditya","CSE",40000));
			tree1.add(new employee(9,"nilesh","CSE",50000));
			tree1.add(new employee(34,"Jishnu","ECE",70000));
			tree1.add(new employee(13,"raju","ME",50000));
			//System.out.print(tree);
			for(employee e:tree1) {
				System.out.println(e);
			}
			break;
		case 3:
			TreeSet<employee> tree2=new TreeSet<>(new MyDepComp());
			tree2.add(new employee(23,"himanshu","ECE",40000));
			tree2.add(new employee(12,"nikhil","ME",60000));
			tree2.add(new employee(24,"akshay","ECE",30000));
			tree2.add(new employee(21,"shamali","CE",40000));
			tree2.add(new employee(19,"Aditya","CSE",40000));
			tree2.add(new employee(9,"nilesh","CSE",50000));
			tree2.add(new employee(34,"Jishnu","ECE",70000));
			tree2.add(new employee(13,"raju","ME",50000));
			//System.out.print(tree);
			for(employee e:tree2) {
				System.out.println(e);
			}
		case 4:
			TreeSet<employee> tree3=new TreeSet<>(new MySalaryComp());
			tree3.add(new employee(23,"himanshu","ECE",40000));
			tree3.add(new employee(12,"nikhil","ME",60000));
			tree3.add(new employee(24,"akshay","ECE",30000));
			tree3.add(new employee(21,"shamali","CE",40000));
			tree3.add(new employee(19,"Aditya","CSE",40000));
			tree3.add(new employee(9,"nilesh","CSE",50000));
			tree3.add(new employee(34,"Jishnu","ECE",70000));
			tree3.add(new employee(13,"raju","ME",50000));
			//System.out.print(tree);
			for(employee e:tree3) {
				System.out.println(e);
			}
		default:
			System.out.println("Wrong Input  !");
		}
		}
	
	}

}

