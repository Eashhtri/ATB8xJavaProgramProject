package oct_oops.ex_11102024.encapsulation;

//Hiding the instance variable and also by making them private in nature and only allow to change by using GETTER and SETTER menthods-- Encapsulation

public class GoodVWologin {
    private String username;
    private String password;

    //We can only change here username and pw if we want to chnage it out of encapsulation way so this called encapsulation
    public GoodVWologin(String username, String password) {

        this.username = username;
        this.password = password;

    }
    //By creating getter setter we can change pw and username or any instance variable value


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if (isAdmin) {
            this.password = password;
        } else {
            System.out.println("Not allowed");

        }

    }
}