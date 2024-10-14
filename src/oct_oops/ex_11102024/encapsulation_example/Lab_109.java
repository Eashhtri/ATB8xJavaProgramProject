package oct_oops.ex_11102024.encapsulation_example;

public class Lab_109 {
    public static void main(String[] args) {
        ICICIbank amit = new ICICIbank("ICICI",550l);
        boolean are_you_admin = true;
        amit.setBal(400,true);
        System.out.println(amit.getBal());
        System.out.println(amit.getName(are_you_admin));


        // This allowed to only ADMIN -- Like we can safegouard this when adding if else condition with boolean
    }
}

