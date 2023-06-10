
// Program to print the grade of a students.
import java.util.*;

class Grading {
    public static void main(String args[]) {
        float comp, eng, maths, sci, hindi, total, percentage;
        Scanner s = new Scanner(System.in);
        System.out.println("\t Students Marks Grade :");
        System.out.println("Enter marks gained in Computer : ");
        comp = s.nextFloat();
        System.out.println("Enter marks gained in English : ");
        eng = s.nextFloat();
        System.out.println("Enter marks gained in Maths : ");
        maths = s.nextFloat();
        System.out.println("Enter marks gained in Science : ");
        sci = s.nextFloat();
        System.out.println("Enter marks gained in Hindi : ");
        hindi = s.nextFloat();
        total = comp + eng + maths + sci + hindi; // total marks cal
        percentage = (total / 500) * 100; // percentage cal
        if (percentage >= 75)
            if (percentage <= 84) {
                System.out.println("Grade = A");
            } else if (percentage >= 85) {
                System.out.println("Grade = S");
            } else if (percentage >= 65)
                if (percentage <= 75) {
                    System.out.println("Grade = B");
                } else if (percentage >= 55)
                    if (percentage <= 64) {
                        System.out.println("Grade = C");
                    } else if (percentage >= 51)
                        if (percentage <= 60) {
                            System.out.println("Grade = D");
                        } else {
                            System.out.println("Faide");
                        }

        System.out.println("Toatl marks : " + total);
        System.out.println("Toatl percentage : " + percentage);
        s.close();
    }
}