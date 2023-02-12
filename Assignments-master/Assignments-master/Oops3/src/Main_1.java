
public class Main {
    public static void main(String[] args) {
        CurrentAcc currentAcc = new CurrentAcc(2000,6000);
        currentAcc.disp();
        SavingAcc savingAcc = new SavingAcc(3000,9000);
        savingAcc.disp();
        double totalBankBalance = currentAcc.getBalance()+ savingAcc.getBalance();
        System.out.println("Total Cash in bank = " + totalBankBalance);
    }
}
