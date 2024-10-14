package oct_oops.ex_11102024.superkeyword;

public class Lab_110 {
    //Super keyword in Java is a reference variable that allows a subclass(Child class to reference the parent class)
    //1.Use of Super with variables
    //2.Use of Super with methods
    //3.Use of super with constructors
    public static void main(String[] args) {

        Car c = new Car();

    }
    void display(){
   System.out.println("Child");
    }


}
    class Car extends vehicle{
        private int max_speed = 40;

        Car(){//Constructor Chaining
            super(20); // Here parent constructor wil also called --
      System.out.println("DC Vehicle");
      System.out.println(this.max_speed);// this calls my value
            this.display(); //Child display
            super.display(); // Parent display


        }
    }

                 class vehicle{
                     public int max_speed = 60;

                     void display(){
                         System.out.println("Parent");
                     }

                   //Default constructor
                     vehicle(){
                         System.out.println(" DC vehicle");
                     }
            //Parameterized Constructor
                     vehicle(int a){
                         System.out.println("PC Vehicle");
                     }

                     //Method overloading -- Same name but methods are different
            void message(){
                         System.out.println("Hello Vehicle");
            }
            void message(int a){
                         System.out.println("Hello vehicle");
            }
                  }