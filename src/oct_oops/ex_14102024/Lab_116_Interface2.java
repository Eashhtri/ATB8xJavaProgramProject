package oct_oops.ex_14102024;

public class Lab_116_Interface2 {
    public static void main(String[] args) {
        H rahul = new H();
        rahul.f1();
        rahul.f2();
        rahul.m1();
        rahul.m2();

        Abc  u = new Abc();
        u.display();
    }
}

class Abc{
    void display(){
        new H().m2();
    }
}


class H implements I1,I2{
    @Override
    public void f1() {
        System.out.println("go to school");
    }

    @Override
    public void f2() {
        System.out.println("reached School");
    }


    @Override
    public void m1() {
        System.out.println("Rahul forgot tiffin box");
    }

    @Override
    public void m2() {
   System.out.println("he ate samosa");
    }
}

interface I1{
    void f1();
    void f2();
}

interface I2{
    void m1();
    void m2();
}
