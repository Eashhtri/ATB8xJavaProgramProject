package sept.Task;

public class Task_23rdsept_simplecalculator {
    public static void main(String[] args) {
//        Create a simple calculator that performs addition, subtraction, multiplication, and division, modus based on user input using switch statements.
//
//                Inputs :   num 1, num 2, +
//                Output :  num1+num2 → print information.

        int num1 = 10;
        int num2 = 20;
        char ch = '+';
        switch (ch){

            case '+':
                System.out.println(num1+num2);

            case '-':
                System.out.println(num1-num2);
                break;

            case'*':
                System.out.println(num1*num2);
                break;

            case '/':
                System.out.println(num1/num2);
                break;

            case'%':
                System.out.println(num1%num2);
                break;





        }
    }
}
