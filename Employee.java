public class Employee {
    String name;
    int age;
    String ID;

    Employee(String name, String ID) {
        this.name = name;
        this.ID = ID;

    }
    public double salary(int salary){
        return salary*12;


    }
    public void show() {
        System.out.println("name:" + name);
        System.out.println("ID:" + ID);
    }

    public static void main(String[] args) {
        Employee emp =new Employee("manish","007");
        double sal=emp.salary(15000);
        System.out.println("Employee Salary:"+sal);
        emp.show();

    }
}
