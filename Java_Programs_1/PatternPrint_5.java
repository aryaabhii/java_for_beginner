// Pattern printing.
// Inverted Half Pyramid printing. (180 deg rotate).

/* ---------------
          *
        * *
      * * *
    * * * *
 ---------------- */

class PatternPrint_5 {
    public static void main(String args[]) {
        int num = 4;

        // outer loop
        for (int i = 1; i <= num; i++) {

            // inner loop (1.) -> to print space
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }

            // inner loop (2.) -> to print *
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
