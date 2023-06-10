import java.util.Scanner;

// Write a program to enter the number till the user wants and at the ened it 
// should display the count of positive, negative and zeros enterd.

class PracticeQuestion_7 {
    // function
    public static void positiveNegativeZeros(int input) {
        int pos = 0, neg = 0, zero = 0;

        // checking condtion for brak and continue.
        while (input == 1) {
            // inputting number till user want. or we can say until input is not equal to
            // zero.
            System.out.print("Enter number : ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            // checking condition
            if (num < 0) {
                neg++;
            } else if (num > 0) {
                pos++;
            } else {
                zero++;
            }

            // Taking input from user.
            System.out.println("Press 0 to stop and 1 to continue.");
            input = sc.nextInt();

            sc.close();
        }

        // final result printing after count.
        System.out.println("Positives : " + pos);
        System.out.println("Negatives : " + neg);
        System.out.println("Zeros : " + zero);
    }

    // main function.
    public static void main(String args[]) {
        // Message for user's.
        System.out.println("Press 0 to stop and 1 to continue.");

        // object creation.
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        // calling function
        positiveNegativeZeros(input);

        sc.close();
    }
}
