package oct_oops.ex_14102024;

public class FIREFOXTC extends BaseClass{
    @Override
    void openBrowser(String Browser) {
        super.openBrowser(Browser);
        System.out.println("Open the Firefox");
    }

    @Override
    void closeBrowser(String Browser) {
        super.closeBrowser(Browser);
        System.out.println("Close the Firefox");
    }
}
