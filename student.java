public class student {
    String name;
    int age ;
    String ID;

    student (String name,int age,String ID){
        this.name=name;
        this.age=age;
        this.ID=ID;

    }

    public void show(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("ID:"+ID);
    }

    public static void main(String[] args) {
        student st =new student("manish",23,"007");
        st.show();

    }

}
