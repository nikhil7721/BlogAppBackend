
public class Manager extends Employee{
    public double incentive, msal;
    public Manager(double msal ,double incentive)
    {
        this.msal = msal;
        this.incentive = incentive;
    }
    @Override
    public void getTotalSal() {
        System.out.println("Managers total Salary = " + totalmsal());
    }

    public double totalmsal() {
        double totalmsal = msal +incentive;
        return totalmsal;
    }
}
