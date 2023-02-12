

public class Main {

    public static void main(String[] args) {
	Manager m = new Manager(1000,2000);
    System.out.println("Manager Incentive = "+m.incentive);
     m.getTotalSal();
    System.out.println();
        Labour l = new Labour(25000,1500);
        System.out.println("Labour Overtime incentive = "+l.overTime);
        l.getTotalSal();
    System.out.println("");
    double totalEmpSal = m.totalmsal() + l.totallsal();
    System.out.println("Total Salary of all Employees = " + totalEmpSal);

    }
}

