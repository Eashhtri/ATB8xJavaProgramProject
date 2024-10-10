package oct_oops.ex_09102024_Polymorphism.Methodoverloading;

public class Lab_105 {
    public static void main(String[] args) {
        Mathoperations m = new Mathoperations();
        int result = m.add(3, 4);
        System.out.println(result);

        String name = m.add("Abhi","Easha");
                System.out.println(result);

    }
}





