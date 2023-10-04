package application;

import entities.Account;
import entities.SavingsAccount;
import entities.BusinessAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Account> list = new ArrayList<>();

        while (true) {
            System.out.print("Account number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Balance: ");
            double balance = sc.nextDouble();
            System.out.print("Interest rate: ");
            double interestRate = sc.nextDouble();
            list.add(new SavingsAccount(number, holder, balance, interestRate));
            boolean a = sc.nextBoolean();
            if (!a){
                break;
            }
        }

        for(Account c : list){
            System.out.println(String.format("%.2f",c.getBalance()));
        }
        sc.close();
    }
}