package oct_oops.ex_09102024_Polymorphism.Methodoverloading;



public class Mathoperations {

    //Method overloading --Multiple methods with the same name, but different parameters -- Like here we have ADD(menthod name)
    //But parameters are different
    int add(int a, int b){
        return a+b;
        //Return type with argument
    }
    String add(String a, String b) {
        return a + b;
    }
}
