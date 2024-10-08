package oct_oops.ex_04102024_ConstructorPC;

public class Lab_096 {
    public static void main(String[] args) {

        Ahuman easha = new Ahuman(); //Default constructor it will call
        Ahuman neha  = new Ahuman("easha");// Parameterized construct
        Ahuman  vijay = new Ahuman();
//        new Ahuman();//Default construct

        System.out.println(easha.name);
        System.out.println(neha.name);
        System.out.println(easha.planet);
        System.out.println(neha.planet);
        System.out.println(vijay.name);

        // functions - perform a task , block of code
       // functions within the class are called -> methods?
       // class -> blueprint
      // object ->  real entity created from the class. / instance of the class.
     // constructor -> - special method which is invoked automatically at the time of **object creation**

    }
}
