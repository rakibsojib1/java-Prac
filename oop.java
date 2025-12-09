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

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    
    Student(String name, int age){
        this.name = name;
        this.age = age;

    }
    Student(){
        System.out.println("constroctor called");
    }

    
}

class Polym{//Polymorphism
    public void test(){
            System.out.println("Im for test");
    }
    public void test(String name){
        System.out.println(name);
    }
    public void test(int age){
        System.out.println("polym age " + age);
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


        Student s1 = new Student();
        s1.name = "Rakib";
        s1.age = 25;

        s1.printInfo(); 

        Student s2 = new Student("Hasan",  25);

        s2.printInfo();


        Polym polym = new Polym();

        polym.test();

        polym.test("No name");
        polym.test(25);


    }


}
