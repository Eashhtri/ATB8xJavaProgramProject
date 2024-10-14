package oct_oops.ex_11102024;

public class Lab_108 {
    public static void main(String[] args) {
        VWOlogin vwologin = new VWOlogin("Eash","IT7999");
        System.out.println(vwologin.password);
        vwologin.password = "New888";
        System.out.println("v");
    }
}
