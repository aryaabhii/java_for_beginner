// Pattern printing.
// Half Pyramid printing.

/* ---------------
    *
    * *
    * * *
    * * * * 
 ----------------*/

class PatternPrint_3 {
    public static void main(String args[]) {
        int num = 4;
        // outer loop
        for (int i = 1; i <= num; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}