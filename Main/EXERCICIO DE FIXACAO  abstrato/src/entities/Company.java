package entities;

public class Company extends TaxPlayer{

    private Integer numberOfEmployees;
    public  Company(){
        super();
    }

    public Company(String name, double annualIncome, Integer numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        double tax = 0;
        if(numberOfEmployees > 10){
            tax = super.getAnnualIncome() * 0.14;
        }
        else {
            tax = super.getAnnualIncome() * 0.16;
        }
        return tax;
    }
}
