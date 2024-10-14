package oct_oops.ex_11102024.Task;

public class APIAutomation {
    public static void main(String[] args) {
        BaseTest1 t2 = new Testcase1();
            t2.getName();
            t2.PerfomGET();

            BaseTest1 t3 = new BaseTest1("Easha",88);
            BaseTest1 t4 = new BaseTest1("Rahul",45);
            t3.getName();
            t3.getId();
            System.out.println(t3.getName());
            System.out.println(t3.getId());
            System.out.println(t4.getId());
            System.out.println(t4.getName());


    }


}
