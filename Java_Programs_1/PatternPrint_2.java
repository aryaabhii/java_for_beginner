// Pattern printing.
// Hollow Rectangle printing.

/* ---------------
    * * * * *
    *       *
    *       *
    * * * * *
 ----------------*/

class PatternPrint_2 {
    public static void main(String args[]) {
        // outer loop.
        int m = 4;
        int n = 5;

        // outer loop.
        for (int i = 1; i <= m; i++) {
            // inner loop.
            for (int j = 1; j <= n; j++) {
                // checking condition
                if (i == 1 || j == 1 || i == m || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}