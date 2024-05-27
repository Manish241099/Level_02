import java.util.*;
public class furniture {

    public class Furniture {
        String type;
        String material;
        int price;
        int option;
        int choice;
        int discount;
        double disAmount;
        double disPrice;
        Scanner sc=new Scanner(System.in);
        public String getType(){
            System.out.println("choose a type of furniture  choice 1: table  choice 2: chair");
            option=sc.nextInt();
            switch(option){
                case 1:
                    type="table";
                    price=2000;
                    break;
                case 2:
                    type= "chair";
                    price=1000;
                    break;
                default:
                    System.out.println("invalid choice, please enter valid choice ");

            }
            return type;
        }

        public String getMaterial() {
            System.out.println("choose a material  choice 1: Wood  choice 2: Plastic");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    material="wood";
                    discount=10;
                    disAmount=price*(discount/100.0);
                    disPrice=price-disAmount;
                    break;
                case 2:
                    material="plastic";
                    discount=20;
                    disAmount=price*(discount/100.0);
                    disPrice=price-disAmount;
            }
            return material;
        }
        public void printDetails() {
            System.out.println("Type" + type);
            System.out.println("price" + price);
            System.out.println("material" + material);
            System.out.println("discount Amount: " + disAmount);
            System.out.println("disPrice : " + disPrice );}

        public static void main(String[] args) {
            Furniture fn=new Furniture();
            fn.getType();
            fn.getMaterial();
            fn.printDetails();
        }
    }

}
