package oct_oops.ex_16102024;

public class Lab_119 {
    public static void main(String[] args) {
        ATBStudents atb = new ATBStudents("amit");
        ATBStudents s1 = new ATBStudents("Rahul");
        ATBStudents s2 = new ATBStudents("Nisha");
        s1.readDocuments();
        s2.readDocuments();
        ATBStudents s3 = new ATBStudents(767388277l);

        ATBStudents.doAssignment();//this is static function to it's same for everyone
    }

}

class ATBStudents {
    {
        System.out.println("IIB"); // If multiple obj are created this will call that times means if obj are created 3 times IIB call 3 times
        //What is purpose
        //Here u can write code related to
        //Start a website before starting a web automation or API automation
        System.out.println("Reading from CSV file");
    }

    static {
        System.out.println("Load the class?, I will execute it");
    }

    private String name;
    private long phone;
    static String coursename = "ATBx";//Because many students are a part of this

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ATBStudents(String name) {
        this.name = name;
    }

    void readDocuments() {
        System.out.println("Non static method");
    }

    static void doAssignment() { //WHY static is used if it has common behavior
        // with complete methods like here students have common thing to do
        System.out.println("Do ASsignment");
        System.out.println(coursename);//Because it's static
//        System.out.println(phone); // and it was instance variable
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public ATBStudents(long phone) {
        this.phone = phone;
    }

    //we can also create static class
    static class ATB{
        //0.0001% this we use in automation so no need to create it
    }
}


