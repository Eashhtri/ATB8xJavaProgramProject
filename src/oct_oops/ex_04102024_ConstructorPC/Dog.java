package oct_oops.ex_04102024_ConstructorPC;



public class Dog {


    String name;
    int age;
    int legs;
    String breed;

        //Default constructor
    Dog(){

        System.out.println("Hi i am DC");
        System.out.println("God is happy!");
    }
        //Parameterized Constructor
    Dog(String breed){
        System.out.println("Hi I am PC");
        this.breed = "gs";
    }
    Dog(String breed,String name, int age,int legs){
        System.out.println("Hi I am PC");
        this.breed =breed;
        this.age = age;
        this.name =name;
        this.legs = legs;

    }


    void walk(){

    }


}
