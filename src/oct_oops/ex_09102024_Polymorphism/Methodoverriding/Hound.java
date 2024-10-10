package oct_oops.ex_09102024_Polymorphism.Methodoverriding;

public class Hound extends Dog{
    Dog d = new Dog();

     @Override
     void bark(){
         System.out.println("Hound can bark");
    }
}
