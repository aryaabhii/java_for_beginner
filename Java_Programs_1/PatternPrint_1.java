// Prinitng pattern 
// Solid Rectangle pattern.

/* ---------------
    * * * * *
    * * * * *
    * * * * *
    * * * * *
 ----------------*/
class PatternPrint_1 {
    public static void main(String args[]) {

        // outer loop
        for (int i = 1; i <= 4; i++) {
            // inner loop
            for (int j = 1; j <= 4; j++) {
                // printing
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
