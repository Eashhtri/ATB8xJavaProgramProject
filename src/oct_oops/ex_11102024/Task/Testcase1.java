package oct_oops.ex_11102024.Task;

public class Testcase1 extends BaseTest1{

    public Testcase1()
    {
     super();
     System.out.println("Testcase1 constructor called");
    }

    @Override
    public void PerformPost() {
        System.out.println("I am overriding method");
    }

    @Override
    public void PerfomGET() {
       System.out.println("I am overring GET method");
    }


    public void PerformPatch(int a){
        System.out.println("I am overloading PATCH");
    }

    //Method overloading
    public void PerformPatch(String name){
        System.out.println("I am overloading PATCH new");
    }

    @Override
    public void PerformPUT() {
        System.out.println("Overriding PUT");
    }
    public void PerformPUT(int a){
        System.out.println("Overring new PUT");
    }

    @Override
    public void PerformDELETE() {
        System.out.println("overriding DELETE method");
    }
}
