package sept.ex_23092024;

public class Lab_064 {
    public static void main(String[] args) {

        // we can use only one default
        String browser = "Google";

        switch(browser){
            case "chrome":
            System.out.println("Starting the chrome browser");
                break;

            case "edge":
                System.out.println("Starting the edge browser");
                break;

            case "firefox":
                System.out.println("Starting the firefox browser");
                break;

            default :
                System.out.println("I have no idea which browser it is");
                break;

        }

    }
}
