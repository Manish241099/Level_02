public class Circle {
    static double radius;
   static double PI=3.14;
    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {

        return 3.14 * (radius * radius);

    }

    public double circumference() {
        return 2*(PI*radius);

    }

    public static void main(String[] args) {
        Circle cr=new Circle(5);
        double result1= cr.area();
        System.out.println("area of circle"+result1);
        double result2=cr.circumference();
        System.out.println("circumference of circle" + result2);

    }
}
