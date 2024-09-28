package sept.ex_23092024;

public class Lab_065 {
    public static void main(String[] args) {
        //JDK -- 13 -- new concept introduced in switch statement
            int itemcode = 000;
            switch (itemcode){
                case 001,002,003: // That's how we can use cases in switch after Jave 13
                    System.out.println("New case");
                    break;

                case 004,005,006:
                    System.out.println("Match the case");
                    break;

                default:
                    System.out.println("No matching cases");
                    break;
            }

    }
}
