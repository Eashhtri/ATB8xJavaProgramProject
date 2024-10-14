package oct_oops.ex_11102024.Task;

public class BaseTest1 {
    private String name;
    private int id;

    public BaseTest1(){
        System.out.println("base class");
}

    public BaseTest1(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public  void PerformPost(){

    }
    public void PerfomGET(){

    }
    public  void PerformPatch(){

    }
    public void PerformPUT(){

    }

    public void PerformDELETE(){

    }
}
