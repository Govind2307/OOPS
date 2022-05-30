class Pen {
    String color;
    String Type;

    public void write() {
        System.out.println("Write something");
    }

    public void printcolor() {
        System.out.println(this.color);
    }
}
class Student{
    String name;
    int age;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    //Function Overloading
    public void printinfo(String name){
        System.out.println(name);
    }
    public void printinfo(int age){
        System.out.println(age);
    }
    // Compile time Polymorphism
    public void printinfo(String name,int age){
        System.out.println(name + " "+age);
    }
}
public class Main {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.Type = "Gel";

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.Type = "Ball Point";

        pen1.printcolor();
        pen2.printcolor();
        pen2.write();
        pen1.write();

        Student std1 = new Student();
        std1.name = "Govind";
        std1.age = 20;

        /*Student std2 = new Student();
        std2.name = "Android";
        std2.age = 15;*/

        /*std1.printifo();
        std2.printifo();*/

        std1.printinfo(std1.name);
        std1.printinfo(std1.age);
        std1.printinfo(std1.name, std1.age);
    }
}