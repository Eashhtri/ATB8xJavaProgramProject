package sept.Task;

// Write a program that classifies a triangle based on its side lengths.
// Given three input values representing the lengths of the sides, determine
// if the triangle is equilateral (all sides are equal),
// isosceles (exactly two sides are equal), or
// scalene (no sides are equal).
// Use an if-else statement to classify the triangle.
// side1, side2, side3 ->

public class Task3_Sept20 {
    public static void main(String[] args) {

        int side1 = 10,side2 =20,side3=30;
        if (side1==side2 && side2==side3 && side1==side3){ // false && false && false = false
            System.out.println("Triangle is equilateral");
        } else if (side1==side2 || side2== side3 || side1 == side3) { // false || false|| false = false
            System.out.println("Triangle is isoleces");
            
        }else{
            System.out.println("Triangle is scalene");
        }
    }
}
