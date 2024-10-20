package oct_oops.ex_14102024;

public class BaseClass extends GrandBaseClass{

    //Web Automation
    //Single
    //Hide the functionality of thr open and close browser

    void openBrowser(String Browser){}
    void closeBrowser(String Browser){}

    @Override
    void takescreenshot() {
System.out.println("Taking Screenshot");
    }

    @Override
    void NobodyKnowsWhereIS() {
        super.NobodyKnowsWhereIS();
        System.out.println("No body KNOWS");
    }
}
