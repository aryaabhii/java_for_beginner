// Write a function that takes in age as input and returns if that person is 
// eligible to vote or not. A person of age > 18 is eligible to vote.

import java.util.Scanner;

public class PracticeQuestion_5 {
    // function
    public static String voteEligibility(int age) {
        // checking condition for eligibilty.
        if (age >= 18) {
            return "Congrats! You are Eligible";
        } else {
            return "Sorry! You are not Eligible";
        }
    }

    // main function.
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Inputting number..
        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        // calling function.
        System.out.print(voteEligibility(age));

        // closeing object.
        sc.close();
    }
}
