package org.example;

import java.util.ArrayList;
import java.util.Scanner;

class MenuItem1 {
    private String name;
    private double price;
    private int quantity;

    // Konstruktor yang benar dengan nama kelas MenuItem1
    public MenuItem1(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Perhitungan total
    public double calculateTotal() {
        return price * quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}

class RestaurantOrder {
    private ArrayList<MenuItem1> orderItems = new ArrayList<>();

    public void addItem(String name, double price, int quantity) {
        MenuItem1 item = new MenuItem1(name, price, quantity);
        orderItems.add(item);
    }


    public void printReceipt() {
            System.out.println("=== Nota Pemesanan ===");
            for (MenuItem1 item : orderItems) {
                System.out.printf("%s (x%d): Rp%.2f\n", item.getName(), item.getQuantity(), item.calculateTotal());
            }
            System.out.printf("Total Biaya: Rp%.2f\n", calculateGrandTotal());
            System.out.println("=======================");
    }

    public double calculateGrandTotal() {
            double total = 0;
            for (MenuItem1 item : orderItems) {
                total += item.calculateTotal();
            }
            return total;
        }


}




    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            RestaurantOrder order = new RestaurantOrder();

             System.out.println("");

             while (true) {
                 System.out.println("Pilih menu: ");
                 System.out.println("1. Sayur Asem - Rp 20.000");
                 System.out.println("2. Kangkung - Rp 30.000");
                 System.out.println("3. Ayam Goreng - Rp 25.000");
                 System.out.println("4. Ikan Bakar - Rp 50.000");
                 System.out.print("Masukkan nomor menu (atau ketik '0' untuk selesai): ");
                 int choice = scanner.nextInt();
                 if (choice == 0) {
                     break;
                 }

                 String name = "";
                 double price = 0;
                 int quantity;

                 switch (choice) {
                     case 1:
                         name = "Sayur Asem";
                         price = 20000;
                         break;
                     case 2:
                         name = "Kangkung";
                         price = 30000;
                         break;
                     case 3:
                         name = "Ayam Goreng";
                         price = 25000;
                         break;
                     case 4:
                         name = "Ikan Bakar";
                         price = 50000;
                         break;
                     default:
                         System.out.println("Pilihan tidak valid.");
                         continue;
                 }



             }


              order.printReceipt();
                      scanner.close();
        }

}
