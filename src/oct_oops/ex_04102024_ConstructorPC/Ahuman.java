package oct_oops.ex_04102024_ConstructorPC;

public class Ahuman {

    // Attributes -- data members and instance variables and properties
        String name;
        String planet ="Ahuman";
        String address;
        long aadhar_card_number;
        String eyes_color;

        //Default Constructor
        Ahuman(){// No return type not even void
            System.out.println("I will be called , Object is created ");
            //I can write a code here which will automatically called when object is created
            // Write a code to read a file  -- like csv file ,Excel here
        }
        //Parameterized constructor
        Ahuman (String name){
            System.out.println("Hi I am parameterized constructor");
            this.name =name;

        }


        //Return type can be  -- Void , any data type(Int, string ,long ,short)
        //Behaviour -- methods and functionalities
        void walk(){
        System.out.println("NRNA");
        }

        int talk(){
            System.out.println("RTNA");
            return 10;

        }

        String sleep(String name) {
            System.out.println("Sleeping");
            System.out.println("RTWA");
            return "I am sleeping";


        }

        void eat(String name){
            System.out.println("Eat");
            System.out.println("NRWA");
        }

    }

