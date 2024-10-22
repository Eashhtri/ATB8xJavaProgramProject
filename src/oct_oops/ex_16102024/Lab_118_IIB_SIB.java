package oct_oops.ex_16102024;

public class Lab_118_IIB_SIB {
    public static void main(String[] args) {
        A a = new A();
        A a1 = new A();
        A a2 = new A();

    }
    
}

class A{
    {
        System.out.println("IIB");
    }

    static {
        System.out.println("SIB");
    }
}

