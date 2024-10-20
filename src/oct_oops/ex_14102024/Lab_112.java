package oct_oops.ex_14102024;

public class Lab_112 {
    public static void main(String[] args) {
        CHROMETc c = new CHROMETc();
        c.openBrowser("Chrome");
        c.closeBrowser("Close");
        System.out.println(c);
        c.takescreenshot();
        c.NobodyKnowsWhereIS();


        FIREFOXTC firefoxtc = new FIREFOXTC();
        firefoxtc.openBrowser("Firefox");
        firefoxtc.closeBrowser("Firefox");
    }
}
