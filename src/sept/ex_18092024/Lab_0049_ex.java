package sept.ex_18092024;

public class Lab_0049_ex {
    public static void main(String[] args) {
        int a = 10;
        //System.out.println(++a + ++a);
        System.out.println(++a + a++ + a++);

        System.out.println(a);


        // Line no | EXP | a
        //  5      |    | 10
        //  6   |11 + 12 | 23 // 10=10+1 = 11(a) -- 11+1 = 12
        // 7    |


    }
}
