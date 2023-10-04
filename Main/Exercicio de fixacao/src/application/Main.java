package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for(int i = 0; i < n ; i++){
            System.out.printf("Product #%d data: \n",i+1);
            System.out.print("Common, used or imported (c/u/i)? ");
            char rsp = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            while(true) {
                if (rsp == 'u') {
                    System.out.print("Manufacture date: ");
                    String dte = sc.next();
                    Date date = sdf.parse(dte);
                    list.add(new UsedProduct(name, price, date));
                    break;
                }
                if (rsp == 'i') {
                    System.out.print("Custom fee: ");
                    double customFee = sc.nextDouble();
                    list.add(new ImportedProduct(name, price, customFee));
                    break;
                }
                if (rsp == 'c'){
                    list.add(new Product(name, price));
                    break;
                }
                else{
                    System.out.print("Please enter a valid character: ");
                    rsp = sc.next().charAt(0);
                }
            }
        }

        System.out.println("PRICE TAGS: ");
        for(Product c : list){
            System.out.println(c.priceTag());
        }

        sc.close();
    }
}
