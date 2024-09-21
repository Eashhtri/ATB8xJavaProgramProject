package sept.ex_18092024;

public class Lab_0044 {
    public static void main(String[] args) {
        // Type Casting ---
        //    - Source and Destination Conversion.
        // Widening  -- Implicit, explicit- lossless
        // Narrowing  - Implicit, explicit (with data type ) loss

        // Widening - a bigger basket is used
        byte a = 10;
      //  int b  = a; // Valid Implicit casting -- JVM (which is done by JVM)
       int b  = (int)a; // Valid Explicit casting -- JVM (which is done by JVM)
        System.out.println(b);


        // Narrowing
         int val = 300;
      //   byte a = val; // Invalid Implicit casting-- JVM
        byte a1 = (byte) val; //Invalid Explicit casting but loss of data
        System.out.println(a1);




    }
}
