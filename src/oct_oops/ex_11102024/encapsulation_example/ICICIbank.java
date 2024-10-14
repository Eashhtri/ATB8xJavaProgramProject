package oct_oops.ex_11102024.encapsulation_example;

public class ICICIbank {
    //Encapsulation
    //Where all the datamembers are bundeled together
    //Data members should be private in nature by default
    //And methods like getter and setter used to access the instance variable or data member with that only u can access data members.

    private String name;
    private long bal;

    //Parameterized constructor
    public ICICIbank(String name, long bal) {
        this.name = name;
        this.bal = bal;


    }

    public String getName(boolean isAdmin) {
        if(isAdmin) {
            return name;
        }else{
            return "null";
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isAdmin) {
        if (isAdmin) {
            this.bal = bal;
            System.out.println("allowed");
        } else {
            System.out.println("Not allowed");
        }
    }
}
