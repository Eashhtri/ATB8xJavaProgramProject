package sept.Task;

import java.util.Scanner;

public class Task1_27sept_Evennumbers {
    public static void main(String[] args) {
//        int i = 2, n;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the numbers");
//        n = sc.nextInt();
//        do {
//            if (i % 2 == 0) {
//                System.out.println(i);
//
//
//            }
//            i++;
//
//
//        } while (i <= n);
        int count = 0;
        int number = 2;
        do{
            System.out.println(number);
            number +=2;
            count++;
        }while(count <=5);
    }
}