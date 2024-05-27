import java.util.Scanner;

class Phone{
    static String make;
    static String model;
    static int storage;
    static int option;
    static int choice;
    static int choose;
    static int modelprice=0;
    static int storagePrice=0;
    static int totalPrice;
    Scanner sc =new Scanner(System.in);
    public String getMake()
    {
        System.out.println("choose your option:1. Apple and 2.samsung");
         option = sc.nextInt();
        switch (option){
            case 1:{
                make="Apple";
                break;
            }
            case 2:{
                make="Samsung";
                break;
            }
        }
        return make;
    }
    public String getModel() {
        if (option == 1) {
            System.out.println("choose your Apple model choice 1:Iphone 15 choice 2:Iphone 14 choice 3:Iphone 13");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    model = "Iphone15";
                    modelprice = 1000;
                    break;
                }
                case 2: {
                    model = "Iphone 14";
                    modelprice = 800;
                    break;
                }
                case 3: {
                    model = "Iphone 13";
                    modelprice = 600;
                    break;
                }
                default: {
                    System.out.println("invalid option please enter valid option");
                }
            }
        } else if (option == 2) {
            System.out.println("choose your samsung model choice 1:Samsung S1 choice 2:Samsung S2 choice 3:Samsung S3");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    model = "Samsung S1";
                    modelprice = 500;
                    break;
                }
                case 2: {
                    model = "Samsung S2";
                    modelprice = 400;
                    break;
                }
                case 3: {
                    model = "Samsung S3";
                    modelprice = 300;
                    break;
                }
                default: {
                    System.out.println("invalid option please enter valid option");
                }
            }
        }
        return model;
    }
    public int getStorage(){
            System.out.println("choose your model storage choose 1: 64 GB choose 2: 128 GB");
            choose=sc.nextInt();
            switch (choose){
                case 1:{
                    storage=64;
                    storagePrice=100;
                    totalPrice=modelprice+storagePrice;
                    break;
                }
                case 2:{
                    storage=128;
                    storagePrice=200;
                    totalPrice=modelprice+storagePrice;
                    break;
                }
                default: {
                    System.out.println("invalid option please enter valid option");
                }
            }
            return storagePrice;
        }
    public void printPhoneDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Storage: " + storage + "GB");
        System.out.println("Price: $" + totalPrice);
    }
    public static void main(String[] args) {
        Phone ph=new Phone();
        ph.getMake();
        ph.getModel();
        ph.getStorage();
        ph.printPhoneDetails();
    }
}