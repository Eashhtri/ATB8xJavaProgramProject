package sept.ex_30092024_functions;

public class Lab_093 {
    public static void main(String[] args) {

        //1.Without Parameters and Without Return Type
        function_type1();


        // 2.Without Parameters but With Return Type
        String name = function_type2();
        System.out.println(name);

        // 3.With Parameters and Without Return Type
        function_type3(18, "Easha", "Eashh",27);

        // 4. With Parameters and With Return Type
        int result = function_type4(3,4);
        System.out.println(result);


    }

    //1.Without Parameters and Without Return Type
    public static void function_type1() {
        System.out.println("1.Without Parameters and Without Return Type");
    }

    public static String function_type2() {
        System.out.println("2.Without Parameters but With Return Type");
        return "Easha";
    }

    // 3.With Parameters and Without Return Type


    public static void function_type3(int age2, String name, String newname, int age) {// So we can pass different types of arguments
        System.out.println("3.With Parameters and Without Return Type");
        System.out.println("You have shared ->" + name);
        System.out.println("Age is 18" + age2);

    }

    // 4. With Parameters and With Return Type
    public static int function_type4(int a, int b){
        System.out.println("4. With Parameters and With Return Type");
        return a+b;
    }

}


