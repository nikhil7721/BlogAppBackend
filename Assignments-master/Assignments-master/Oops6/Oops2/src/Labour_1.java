
public class Labour extends Employee{
    public double overTime ,lsal;
    public Labour(double lsal ,double overTime)
    {
        this.lsal = lsal;
        this.overTime = overTime;
    }
    @Override
    public void getTotalSal() {
        System.out.println("Labour total salary = " +  totallsal());
    }
    public double totallsal() {
        double totallsal = lsal +overTime;
        return totallsal;
    }
}
