import java.sql.SQLOutput;
import java.util.Scanner;

public class TV {
    static String brand;
    static int size;
    static int price;
    static int option;
    static int choice;
    static double discount;
    static double discount_price;
    static double discount_amount;
    Scanner sc=new Scanner(System.in);
    public String getBrand(){
        System.out.println("choose your brand option 1:panasonic option 2:videocone");
        option=sc.nextInt();
        switch (option){
            case 1:{
                brand="Panasonic";
                price=50000;
                break;
            }
            case 2:{
                brand="videocone";
                price=30000;
                break;
            }

            default: {
                System.out.println("invalid option please enter valid option");
            }
        }
        return brand;
    }
    public int getSize(){
        System.out.println("choose the size of TV choice 1. 50 inches 2.45 inches 3.40 inches");
        choice=sc.nextInt();
        switch (choice){
            case 1:{
                size=50;
                discount=20;
                discount_amount=price *(discount/100);
                discount_price=discount_amount-price;
                break;
            }
            case 2:{
                size=45;
                discount=10;
                discount_amount=price*(discount/100);
                discount_price=discount_amount-price;
                break;

            }
            case 3:{
                size=40;
                discount=5;
                discount_amount= price *(discount/100);
                discount_price=price-discount_amount;
                break;

            }
            default: {
                System.out.println("invalid option please enter valid option");
            }

        }
        return size;

    }
    public void printPhoneDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("size: " + size);
        System.out.println("actual price: " + price );
        System.out.println("discounted price $" + discount_price);
        System.out.println(discount_amount);
    }

    public static void main(String[] args) {
        TV tv=new TV();
        tv.getBrand();
        tv.getSize();
        tv.printPhoneDetails();
    }

}
