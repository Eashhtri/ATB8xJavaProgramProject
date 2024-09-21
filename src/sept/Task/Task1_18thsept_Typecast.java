package sept.Task;

public class Task1_18thsept_Typecast {
    public static void main(String[] args) {
        // Give some another example of Widening with Implicit and Explicit, Narrowing with implicit and explicit.
      //  1.Widening Implicit
        long a = 156782828;
        double b = a;
        System.out.println(b);

        // Widening Explicit

        int c = 12334599;
        double t = (double) c;
        System.out.println(t);

        // Narrowing

        //1. Implicit Narrowing
//        long y = 156782828;
//        short h1 = y;
//        System.out.println(h1);

        //2. Explicit narrowing
        double a2 = 138374674;
        byte l1 = (byte) a2;
        System.out.println(l1);







    }
}
