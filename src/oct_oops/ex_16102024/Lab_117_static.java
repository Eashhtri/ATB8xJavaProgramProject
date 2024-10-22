package oct_oops.ex_16102024;

public class Lab_117_static {
    //The **static** keyword in Java is a non-access modifier that is primarily used for memory management
    // and to define class-level variables and methods.
    //-> Static variables are variable which are created at the time of the class loading.

    public static void main(String[] args) {
        Student s1 = new Student(26);
        Student s2 = new Student(34);
        System.out.println(s1.age);
        System.out.println(Student.school_name);
        // In case of static class we don't have to create object to access the school_name or static class
       Student.school_name ="NEW ERA";
       System.out.println(Student.school_name);
        {
            //IIB you can write it like this
            System.out.println("IIB");
            System.out.println("Here you can write a code what you want to do when Object is created");
            System.out.println("Read a MySQL db()");
        }


    }
    static {
        System.out.println("SIB");
        System.out.println("loaded once when class is loaded ");
    }
}

class Student{
    int age;// This is Instance variable and also(Non Static)
    static String school_name = "ABC";//This is called static variable
//para constructor
    public Student(int age) {
        this.age = age;

    }
}
