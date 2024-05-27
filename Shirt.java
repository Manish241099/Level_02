import java.util.Scanner;

    public class Shirt {
        String size;
        String color;
        int price;
        int option;
        int choice;
        int discount;
        double disAmount;
        double disPrice;
        Scanner sc = new Scanner(System.in);

        public String getColor() {
            System.out.println("choose a color option 1  green  option 2 blue");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    color = "green";
                    price = 500;
                    break;
                case 2:
                    color = "blue";
                    price = 400;
                    break;
                default:
                    System.out.println("invalid choice, please enter valid choice ");


            }
            return color;

        }

        public int getSize() {
            System.out.println("choose a size option 1: L  option 2: XL ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    size = "l";
                    discount = 10;
                    disAmount = price * (discount / 100.0);
                    disPrice = price - disAmount;

                    break;
                case 2:
                    size = "XL";
                    discount = 20;
                    disAmount = price * (discount / 100.0);
                    disPrice = price - disAmount;

                    break;
                default:
                    System.out.println("invalid choice, please enter valid choice ");
            }
            return discount;
        }

        public void printDetails() {
            System.out.println("color" + color);
            System.out.println("Size" + size);
            System.out.println("price: " + price);
            System.out.println("disAmount: " + disAmount);
            System.out.println("disPrice : " + disPrice);

        }

        public static void main(String[] args) {
            Shirt st=new Shirt();
            st.getColor();
            st.getSize();
            st.printDetails();
        }
    }

}
