import java.util.Scanner;

public class Dog {
    static String breed;
    static int age;
    static int weight;
    Scanner sc = new Scanner(System.in);
    public void setBreed (String breed){
        this.breed=breed;
    }
    public void setAge (int age){
        this.age=age;

    }
    public void setWeight (int weight){
        this.weight=weight;

    }
    public int calcAge(){
        return age * 7;
    }
    public String getBreed( ){
        return breed;
    }

    public int getAge(){
        return age;
    }
    public int getWeight(){
        return weight;
    }

    public static void main(String[] args) {
        Dog dg =new Dog();
        System.out.println("enter the dog breed: ");
        Scanner sc =new Scanner(System.in);
        breed= sc.nextLine();
        dg.setBreed(breed);
        dg.getBreed();
        System.out.println("dog breed is:"+breed);

        System.out.println("enter the dogs Age:");
        age = sc.nextInt();
        dg.setAge(age);
        dg.getAge();
        System.out.println("dog age is:"+age);

        System.out.println("enter the weight of dog:");
        weight=sc.nextInt();
        dg.setWeight(weight);
        dg.getWeight();
        System.out.println("dog weight is:"+weight);

        int res=dg.calcAge();
        System.out.println("Dogs years in human Years:"+res);
    }
}
