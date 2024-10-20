package oct_oops.ex_14102024.realex2;

public class Waganor extends Engine{


    void drive(){
        StartEngine();
        StopEngine();
    }

    @Override
    void StartEngine() {
        System.out.println("Starting car");
    }

    @Override
    void StopEngine() {
System.out.println("Stop the car");
    }
}
