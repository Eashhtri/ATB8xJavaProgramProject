package oct_oops.ex_11102024.superkeyword;

public class BaseClass {
    private String browser;

    BaseClass() {
        System.out.println("DC - Baseclass");
    }

    BaseClass(String b) {
        System.out.println("CC - Baseclass");
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser,boolean isAuth) {
        if(isAuth){
            this.browser = browser;
        }else{
            System.out.println("Not Allowed");
        }



    }
    void openBrowser(){
        System.out.println("Chrome Browser !!");
    }

    void openBrwoser(String browsername){
        System.out.println("open browser --> " + browsername);
    }
    void closeBrowser(){
        System.out.println("Close browser");
    }

}
