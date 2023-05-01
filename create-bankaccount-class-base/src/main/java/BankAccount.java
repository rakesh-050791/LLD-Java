public class BankAccount {
    String accountNumber;
    int balance;
    double roi;

    double getSimpleInterest(int time){
        double simpleInterest = (this.balance * this.roi * time) / 100;
        return simpleInterest;
    }

     double getBalanceWithInterest(int time){
        double simpleInterest = getSimpleInterest(time);
        double newBalance = this.balance + simpleInterest;
        return newBalance;
    }
}