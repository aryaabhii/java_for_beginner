// Pattern printing.
// Butterfly pattern.

/*
    *                                * 
    *  *                          *  * 
    *  *  *                    *  *  * 
    *  *  *  *              *  *  *  * 
    *  *  *  *  *        *  *  *  *  * 
    *  *  *  *  *  *  *  *  *  *  *  * 
    *  *  *  *  *  *  *  *  *  *  *  * 
    *  *  *  *  *        *  *  *  *  * 
    *  *  *  *              *  *  *  * 
    *  *  *                    *  *  * 
    *  *                          *  * 
    *                                *
*/

class PatternPrint_10 {
    public static void main(String args[]) {
        int row = 6;

        // upper part.
        for (int i = 1; i <= row; i++) {

            // upper left part.
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }

            // for spaces.
            int space = 2 * (row - i);
            for (int j = 1; j <= space; j++) {
                System.out.print("   ");
            }

            // upper right part
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }

            System.out.println();
        }

        // lower part.
        for (int i = row; i >= 1; i--) {

            // lower left part.
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }

            // for spaces.
            int space = 2 * (row - i);
            for (int j = 1; j <= space; j++) {
                System.out.print("   ");
            }

            // lower right part
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }

            System.out.println();
        }
    }
}