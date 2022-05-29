class Pen{
    String color;
    String Type;
    public void write(){
        System.out.println("Write something");
    }
}
public class Main {
    public static void main(String[] args) {
         Pen pen1 = new Pen();
         pen1.color = "Blue";
         pen1.Type = "Gel";

         pen1.write();
    }
}