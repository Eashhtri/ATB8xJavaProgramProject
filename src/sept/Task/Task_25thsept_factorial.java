package sept.Task;

public class Task_25thsept_factorial {
    public static void main(String[] args) {

        int n= 5;
        int fact =1;

        for(int i = 1; i<=5; i++){
            fact = fact*i;
        }
        System.out.println("Factorial number"  +fact);
    }
}
