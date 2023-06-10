// Pattern printing.
// half pyramid with number.
/*
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1
*/

class PatternPrint_7 {
    public static void main(String args[]) {
        int num = 5;

        // outer loop.
        for (int i = 1; i <= num; i++) {
            // inner loop.
            for (int j = 1; j <= num - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}