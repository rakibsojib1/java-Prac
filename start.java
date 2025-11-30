public class start{
    //method 
    public void greet(){
        greet(null, false);
    }
    public void greet(String  name, boolean ishuman){
        if(name == null || name.isEmpty()){
            System.out.println("Hello, Guest! from greet method");
            if(ishuman){
                for(int i=0; i<5; i++){
                    System.out.println("not a bot");
                }
            }else{
                int[] arr = new int[5];
                int a = 1;
                for(int i=0; i<arr.length; i++){
                    arr[i] = i * 2;
                    a++;
                    System.out.println("Bot version. " + arr[i]+ "."+a);
                }
            }

        } else {
            System.out.println("Hello, " + name + "! from greet method");
            String[] all_students = {"Rakib", "Sakib", "Jahid", "Rafiq", "Salam"};
            System.out.println("Current total Students: "+all_students.length);
            for(String student : all_students){
                System.out.println("Student Name: "+student);
            }
        }
    }

    public static void main(String[] args){
         System.out.println("Hello, World!");
         start obj = new start();
         obj.greet();
         obj.greet("Rakib", true);
    }
}


