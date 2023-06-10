// Enter five subjects marks from the user & make a function to print their average, total marks, percentage and grade.

import java.util.Scanner;

class PracticeQuestion_1 {
    // function for calculation of total marks.
    public static int totalMarks(int maths, int computer, int science, int hindi, int sst) {
        int totalMarks = maths + computer + science + hindi + sst;
        return totalMarks;
    }

    // function for calculation of average marks.
    public static float averageMarks(float totalMarks) {
        int subjectNumber = 5; // total number of sunject
        float averageMarks = totalMarks / subjectNumber;
        return averageMarks;
    }

    // function for calculation of percentage marks.
    public static float percentageMarks(float totalMarks) {
        float percentageMarks = ((totalMarks / 300) * 100);
        return percentageMarks;
    }

    // main function.
    public static void main(String args[]) {

        // scanner object
        Scanner sc = new Scanner(System.in);

        // for taking input from keyboard......
        System.out.print("Enter Maths mark    : ");
        int maths = sc.nextInt();
        System.out.print("Enter Computer mark : ");
        int computer = sc.nextInt();
        System.out.print("Enter Science mark  : ");
        int science = sc.nextInt();
        System.out.println("Enter Hindi mark  : ");
        int hindi = sc.nextInt();
        System.out.println("Enter S.st marks : ");
        int sst = sc.nextInt();

        // calling function..
        int totalMarks = totalMarks(maths, computer, science, hindi, sst);
        float averageMarks = averageMarks(totalMarks);
        float percentageMarks = percentageMarks(totalMarks);

        // For printing
        System.out.println("Total Marks      : " + totalMarks);
        System.out.println("Average Marks    : " + averageMarks);
        System.out.println("Percentage Marks : " + percentageMarks);

        // for grade calculation
        if (percentageMarks >= 80) {
            System.out.println("First division.");
        } else if (percentageMarks >= 55 || percentageMarks <= 80) {
            System.out.println("Second division.");
        } else if (percentageMarks >= 35) {
            System.out.println("Third division.");
        } else {
            System.out.println("Fail!");
        }

        // closing the object.
        sc.close();
    }
}