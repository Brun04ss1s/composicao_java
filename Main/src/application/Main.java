package application;

import entities.Product;
import entities.client;
import entities.enums.Order;
import entities.enums.OrderStatus;
import entities.orderItem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());
        client client = new client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus orderstatus= OrderStatus.valueOf(sc.next());
        Date moment = new Date();
        Order order = new Order(moment, orderstatus, client);

        System.out.println("How many items to this order? ");
        int n = sc.nextInt();

        for (int i = 0; i<n ; i++){
            System.out.printf("Enter #%d item data: \n", i+1);
            System.out.print("Product Name: ");
            String productName = sc.next();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(productName,price);
            orderItem orderItem = new orderItem(quantity,price, product);
            order.addItem(orderItem);
        }

        System.out.println("ORDER SUMMARY: ");
        System.out.println(order);

        sc.close();
    }
}