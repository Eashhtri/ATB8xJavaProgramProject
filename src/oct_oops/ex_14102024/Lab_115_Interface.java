package oct_oops.ex_14102024;

//import java.lang.classfile.Interfaces;

public class Lab_115_Interface {
    public static void main(String[] args) {

P p = new P();
p.f1();
    }

}
class P implements I{
   @Override
    public void f1(){
       System.out.println("P");

   }
}

interface I{

void f1();
}

