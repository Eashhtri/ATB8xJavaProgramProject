package oct_oops.ex_14102024;

public class Lab_117 {
}


interface I3{

    default void start(){
  System.out.println("BODY, DM!!");


    }
    //Multiple defaults methods we can use
      //default void stop(){
        //if we want to normal then keep it like this

    void car();
    void stop();

    static void ss(){
        System.out.println("Static can also have a body in  interface");
    }

abstract class Aa{
        void f1(){
            System.out.println("Concrete Method");
        }
        abstract void f2();
}
static void f4(){
        System.out.println("YES static is possible in abstract class");
}
        }
