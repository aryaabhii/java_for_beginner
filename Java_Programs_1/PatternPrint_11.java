// Pattern printing.
// Solid Rohmbus

/*
            * * * * *
          * * * * *    
        * * * * *    
      * * * * *              
    * * * * *         
*/

class PatternPrint_11 {
    public static void main(String args[]) {

        int num = 5;

        // outer loop for row.
        for (int i = 1; i <= num; i++) {

            // for spaces.
            for (int j = 1; j <= num - i; j++) {
                System.out.print("  ");
            }

            // for stars.
            for (int j = 1; j <= 5; j++) {
                System.out.print(" *");
            }

            System.out.println();
        }
    }
}
