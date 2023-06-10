// Pattern printing.
// Inverted Half Pyramid printing.

/* ---------------
    * * * *
    * * *  
    * *  
    *  
 ----------------*/

class PatternPrint_4 {
    public static void main(String args[]) {

        int num = 4;

        // outer loop.
        for (int i = num; i >= 1; i--) {
            // inner loop.
            for (int j = i; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /*
         * // rules 2nd
         * for (int i = num; i >= 1; i--) {
         * // inner loop.
         * for (int j = 1; j <= i; j++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */
    }
}