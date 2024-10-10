package oct_oops.ex_09102024_Inheritnace.Conceptof_HasA_Aggregation_HasA;

public class Car {
    //Car Has-A Engine and a Tyre

    protected void startcar(){
        new Engine().start();
        new Tyre().rolling();


    }
}
