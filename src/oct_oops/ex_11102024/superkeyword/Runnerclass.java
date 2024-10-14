package oct_oops.ex_11102024.superkeyword;

public class Runnerclass {
    public static void main(String[] args) {
        BaseClass t1 = new Testcase1();//Dynamic Dispatch -- father as object and child as reference
          t1.openBrowser();
          t1.closeBrowser();
          System.out.println(t1);

        }

}
