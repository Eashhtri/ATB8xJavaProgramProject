package oct_oops.Task;

public class Person {

    String name;
    String lastname;
    int age;
    String gender;
    long mobile_number;
    long aadhar_number;
    int legs;
    String eye_colour;
    int nose;
    int ears;

    void walk(){

    }
    void talk(){

    }
    void sleep(){

    }
    void run(){

    }
    void eat(){

    }

    //default constructor
    Person(){
        System.out.println("Hi, I am default constructor");

    }

    //Parameterized Constructor
    Person( String name, String lastname, int age, String gender, long mobile_number, long aadhar_number, int legs, String eye_colour, int nose, int ears){

        System.out.println("Hi, I am a parameterized constructor");

        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
        this.mobile_number = mobile_number;
        this.aadhar_number = aadhar_number;
        this.legs = legs;
        this.eye_colour = eye_colour;
        this.ears = ears;
        this.nose = nose;

    }
}
