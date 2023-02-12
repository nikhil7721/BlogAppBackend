
public class SavingAcc extends Bank{
    public double fixedDeposit;
    SavingAcc(double balance ,double fixedDeposit)
    {
        super(balance);
        this.fixedDeposit = fixedDeposit;
    }
    @Override
    public double getBalance()
    {
        double savingBalance = balance + fixedDeposit;
        return savingBalance;
    }
    public void disp()
    {
        System.out.println("Initial Balance = " + balance);
        System.out.println("Fixed Deposit = " + fixedDeposit);
        System.out.println(" Total Saving Account Holder Balance= "+ getBalance());
        System.out.println("");
    }
}
