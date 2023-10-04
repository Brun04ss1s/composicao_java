package entities;


public class BusinessAccount extends Account{

    private double loanLimit;
    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    @Override
    public void withdraw(Double amount){
        super.withdraw(amount);
        balance -= 2;
    }

}
