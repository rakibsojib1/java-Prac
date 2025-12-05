class Pen {
    String color;
    String type;

    public void write(){
        System.out.println("Writing Something");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

public class Oop {
    public static void main(String args[]){
        System.out.println("Hello me");

        Pen pen1 = new Pen();
        pen1.color = "blue";

        Pen pen2 = new Pen();
        pen2.color = "black";

        pen1.printColor();
        pen2.printColor();
    }
}
