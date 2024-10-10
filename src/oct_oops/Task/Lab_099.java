package oct_oops.Task;

public class Lab_099 {
    public static void main(String[] args) {

        Car easha = new Car(); // Default constructor



        //This is for parameterized constructor
        Car obj1 = new Car("Harrier",4,"Black",783,"Base");

        System.out.println(obj1.car_name);
        System.out.println(obj1.tyre);
        System.out.println(obj1.color);
        System.out.println(obj1.car_number);
        System.out.println(obj1.model_name);
    }
}
