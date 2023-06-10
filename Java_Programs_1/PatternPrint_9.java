// Pattern printing.
// 0 - 1 Triangle with number.

/*
    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1
*/

class PatternPrint_9 {
    public static void main(String args[]) {
        int num = 5;

        // outer loop for row.
        for (int i = 1; i <= num; i++) {
            // inner loop.
            for (int j = 1; j <= i; j++) {
                // checking condtion if even then print 1 if odd then print 0
                if (((i + j) % 2) == 0) {
                    System.out.print("1 "); // printig 1 when even
                } else {
                    System.out.print("0 "); // printing 0 when odd
                }
            }
            System.out.println();
        }
    }
}
