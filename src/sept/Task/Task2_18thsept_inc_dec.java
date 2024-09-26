package sept.Task;

public class Task2_18thsept_inc_dec {
    public static void main(String[] args) {

        int a = 10;
        System.out.println(--a + a --  + a--);
        System.out.println(a);

//        System.out.println(--a + a++ + a--);
//        System.out.println(a);

        System.out.println(a-- + a-- + a--);
        System.out.println(a);

        // Part A -> a-- , Exp1 = 10, a=9
        // Part B -> a-- , Exp2 = 9, a=8
        // Part B -> a-- , Exp3 = 8, a=7
        // Total Exp = 27
        // Final value a=7



    }
}
