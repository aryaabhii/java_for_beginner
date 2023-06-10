// Trying to print A using star.

/*
 *         *
 *        * *
 *       *   *
 *      *******
 *     *       *
 *    *         *
 *   *           *
 * 
 */

class Abhijeet {
    public static void main(String arg[]) {
        int row = 5;
        int col = 10;

        int fp = col / 2;
        int sp = col / 2;

        // outer loop.
        // lower part.
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (j == fp || j == sp || i == col / 2 && j > fp && j < sp && j % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            fp--;
            sp++;
        }
    }
}
