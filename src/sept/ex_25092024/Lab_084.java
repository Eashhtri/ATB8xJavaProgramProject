package sept.ex_25092024;

public class Lab_084 {
    public static void main(String[] args) {
        for (int i =0; i<=50; i++){
            System.out.println(i);
        }
        for (int i =0; i<=50; ++i){
            System.out.println(i);
        }
        for (char i ='A'; i<='Z'; i++){
            if (i=='P'){
                continue;

        }
            System.out.println(i);
        }
    }
}
