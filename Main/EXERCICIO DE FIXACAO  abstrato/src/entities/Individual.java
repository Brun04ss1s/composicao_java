package entities;

public class Individual extends TaxPlayer{

    private double healthExpenditures;
    public Individual(){

    }

    public Individual(String name, double annualIncome, double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        double tax = 0;
        if(super.getAnnualIncome() < 20000.0 ){
            tax = (super.getAnnualIncome() *0.15) - (healthExpenditures * 0.5);
        }
        else{
            tax = (super.getAnnualIncome() *0.25) - (healthExpenditures * 0.5);
        }
        return tax;
    }
}
