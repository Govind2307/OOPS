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
    }
}