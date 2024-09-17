package sept.ex_16092024;

public class Lab_0034_Relational_operators {

    public static void main(String[] args) {

        //Relational Operators  = boolean
        // < > , >= <= , != , ! --> true or false

        int a = 20;
        int b = 30;
        boolean c = a > b;
        System.out.println(c);

        int age_Monika = 44;
        int age_namita = 34;

       // boolean result == age_Monika > age_namita ; // false
        boolean result = age_Monika >= age_namita ; // false --// age_monika > age-namita OR age_monika = age_namita;
        System.out.println(result);

    }
}
