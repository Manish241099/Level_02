

import java.util.Scanner;

public class Computer {
    String processor;
    int ram;
    int storage;
    int option;
    int proPrice;
    int choice;
    int rPrice;
    int choose;
    int storPrice;
    int TotalPrice;
    Scanner sc = new Scanner(System.in);

    public String processor() {
        System.out.println("choose a processor option 1: intel i6 option 2: intel i7");
        option = sc.nextInt();
        switch (option) {
            case 1:
                processor = "intel i6";
                proPrice = 7000;
                break;
            case 2:
                processor = "intel i7";
                proPrice = 9000;
                break;
            default:
                System.out.println("pinvalid choice, please enter valid choice ");
        }
        return processor;
    }

    public int RAM() {
        System.out.println("choose a RAM choice 1: 8Gb choice 2: 9Gb ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                ram = 8;
                rPrice = 500;
                break;
            case 2:
                ram = 9;
                rPrice = 1000;
                break;
            default:
                System.out.println("rinvalid choice, please enter valid choice ");
        }
        return ram;
    }

    public int storage() {
        System.out.println("choose a Storage choice 1: 64Gb choice 2: 128Gb ");
        choose = sc.nextInt();
        switch (choose) {
            case 1:
                storage = 64;
                storPrice = 500;
                break;
            case 2:
                storage = 128;
                storPrice = 5000;
                TotalPrice = proPrice + rPrice + storPrice;
                break;
            default:
                System.out.println("sinvalid choice, please enter valid choice ");
        }
        return TotalPrice;

    }

    public void printDetails() {
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Storage: " + storage + "GB");
        System.out.println("Price: $" + TotalPrice);
    }

    public static void main(String[] args) {
        Computer cp= new  Computer();
        cp.processor();
        cp.RAM();
        cp.storage();
        cp.printDetails();
    }
}

