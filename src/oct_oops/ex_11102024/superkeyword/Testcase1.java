package oct_oops.ex_11102024.superkeyword;

public class Testcase1 extends BaseClass{

    //Test case IsA type of base class -- Single Inheritance

    Testcase1(){
        super();// Dc of Parent
        this.setBrowser("edge",true);
    }

    @Override
    public void setBrowser(String browser, boolean isAuth) {
        super.setBrowser(browser, isAuth);
    }
}
