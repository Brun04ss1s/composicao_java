package application;

import entities.Company;
import entities.Individual;
import entities.TaxPlayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPlayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0 ;i < n ; i++){
            System.out.printf("Tax payer #%d data: \n", i+1);
            System.out.print("Individual or company (i/c)? ");
            char resp = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Annual income: ");
            double annualIncome = sc.nextDouble();

            if(resp == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, annualIncome, healthExpenditures));
            }
            if(resp == 'c'){
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new Company(name, annualIncome, numberOfEmployees));
            }
        }
        System.out.println(" ");
        double total_tax = 0;

        System.out.println("TAXES PAID:");
        for(TaxPlayer c : list){
            System.out.println(c);
            total_tax += c.tax();
        }

        System.out.printf("\nTOTAL TAXES: $ %.2f\n", total_tax);
        sc.close();
    }
}