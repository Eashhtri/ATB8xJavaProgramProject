package sept.Task;

public class task5_20sept {
    public static void main(String[] args) {
        //Create a program that determines whether a given year is a leap year. A leap year is divisible by 4, but not by 100 unless it is also divisible by 400. Use an if-else statement to make this determination.

    int year  = 2024;
    boolean isleapyear = false;

        if ((year % 4 == 0  &&  year % 100 != 0) || (year % 400 == 0)) {
            isleapyear = true;


        } if (isleapyear) {
            System.out.println("is a leap year" +year);

        }else{
            System.out.println("is not aleap year" +year);
        }

    }
}
