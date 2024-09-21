package sept.ex_18092024;

public class Lab_0045_Inc_Dec_operator {
    public static void main(String[] args) {
        // Increment(++) and Decrement (--) Operstors
        // Pre and Post

        // Pre - Increment -- ++ operand.
        // Value is incremented first and then stored in the result

        int a = 20;
        int  b = ++a; // a = a+1 -- this ++a do this way of increment value
        System.out.println(b);

        //Post Increment = a++
        //Print first then increase

        int a_post = 20;
        System.out.println(a_post++); // here it's counting value first then incrementing it
        System.out.println(a_post); // here incremented value get printed

    }
}
