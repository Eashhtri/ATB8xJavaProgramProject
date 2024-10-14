package oct_oops.ex_11102024.encapsulation;

public class Lab_107 {
    public static void main(String[] args) {
        GoodVWologin vwologin = new GoodVWologin("Admin","GT5666");
                System.out.println(vwologin.getPassword());

                //Checking admin
                boolean isAdmin = false;
                vwologin.setPassword("Eash2923",isAdmin);
                System.out.println(vwologin.getPassword());



    }
}
