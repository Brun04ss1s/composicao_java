package application;

import entities.Employee;
import entities.OutSourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.printf("Employee #%d data:\n", i + 1);
            System.out.print("Outsourced(y/n)? ");
            char resp = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();
            if (resp == 'y') {
                System.out.print("Additional charge: ");
                Double additionalCharge = sc.nextDouble();

                Employee emp = new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge);
                list.add(emp);
            } else {
                Employee emp = new Employee(name, hours, valuePerHour);
                list.add(emp);
            }
        }
        System.out.println("PAYMENTS: ");
        for (Employee c : list) {
            System.out.print(c);
        }
        sc.close();
    }
}