package sept.ex_20092024;

public class Lab_0054 {
    public static void main(String[] args) {
        // Ternary Operators to handle multiple conditions.
        //
        //// Input → int score = 85
        //
        //// String grade →
        //
        ////  score >= 90 → A
        ////  score >= 80 → B
        ////  score >= 70 → C

        int score  = 85;
        String grade = score >= 90 ? "A" : (score>=80 ? "B" : (score>=70 ? "C"  :(score >= 50 ? "D" : "E")));
        System.out.println(grade);

    }
}
