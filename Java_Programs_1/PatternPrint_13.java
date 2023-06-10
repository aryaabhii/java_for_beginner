// Pattern printing.
// Palindrome Pattern.

/*
           1 
         2 1 2
       3 2 1 2 3
     4 3 2 1 2 3 4
   5 4 3 2 1 2 3 4 5
   
*/

class PatternPrint_13 {
    public static void main(String args[]) {

        int num = 5;

        // outer loop for row.
        for (int i = 1; i <= num; i++) {
            // for space
            for (int j = 1; j <= num - i; j++) {
                System.out.print("  ");
            }

            // for number print left.
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // for number print right.
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
