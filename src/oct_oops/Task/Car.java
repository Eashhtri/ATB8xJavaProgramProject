package oct_oops.Task;

public class Car {


    String car_name;
    int tyre;
    String color;
    int car_number;
    String model_name;

    void start(){

    }

    void stop(){

    }

    void gear(){


    }

    Car(){
        System.out.println("Hi i am Dc");
    }

    // Parameterized constructor
    Car(String car_name,int tyre,String color, int car_number, String model_name) {

        System.out.println("Hi i am Easha's car");

        this.car_name = car_name;
        this.tyre = tyre;
        this.car_number = car_number;
        this.model_name= model_name;
        this.color = color;



    }
}
