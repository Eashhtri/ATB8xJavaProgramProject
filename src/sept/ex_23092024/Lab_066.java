package sept.ex_23092024;

public class Lab_066 {
    public static void main(String[] args) {
        int itemcode = 00;

        switch (itemcode){
            case 001 -> System.out.println("case 1 is right"); // -> this remove break from code this work like break.
            case 002 -> System.out.println("new case");
            case 003 -> System.out.println("One more case");
            default -> System.out.println("No matching value");
        }
    }
}
