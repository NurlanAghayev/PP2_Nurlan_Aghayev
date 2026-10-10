import java.util.Scanner;
public class Invoicetest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write Part number: ");
        String partnumber = sc.next();
        System.out.println("Write Description: ");
        String description = sc.next();
        System.out.println("Write Quantity: ");
        int quantity = sc.nextInt();
        System.out.println("Write Price: ");
        double price = sc.nextDouble();


        Invoice num1 = new Invoice(partnumber, description, quantity, price);
        System.out.print(num1.getPartnumber() + " " +  num1.getDescription()+" "  + num1.getQuantity() +" " + num1.getPrice() +" "+ num1.getInvoiceAmount());
    }
}