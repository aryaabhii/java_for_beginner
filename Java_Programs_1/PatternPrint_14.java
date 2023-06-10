// Pattren Print...
// Diamond

/*
               * 
            *  *  *    
         *  *  *  *  * 
      *  *  *  *  *  *  * 
      *  *  *  *  *  *  *
         *  *  *  *  *
            *  *  *
               *
*/

class PatternPrint_14 {
    public static void main(String args[]) {
        int num = 4;

        // for outer loop or upper part of diamond.
        for (int i = 1; i <= num; i++) {

            // for spaces.
            for (int j = 1; j <= num - i; j++) {
                System.out.print("   ");
            }

            // for upper left part
            // for (int j = 1; j <= 2 * i - 1; j++)
            for (int j = i; j >= 1; j--) {
                System.out.print(" * ");
            }

            // for upper right part
            for (int j = 2; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        // for outer loop or inner part of diamond.
        for (int i = num; i >= 1; i--) {

            // for spaces.
            for (int j = 1; j <= num - i; j++) {
                System.out.print("   ");
            }

            // for upper left part
            // for (int j = 1; j <= 2 * i - 1; j++)
            for (int j = i; j >= 1; j--) {
                System.out.print(" * ");
            }

            // for upper right part
            for (int j = 2; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
