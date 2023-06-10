// Pattern Print.
// A hollow Butterfly..

class PatternPrint_15 {
    public static void main(String args[]) {
        int num = 5;

        // outer loop.
        for (int i = 1; i <= num; i++) {
            // for space.
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }

            // for left side star
            for (int j = 1; j <= i; j++) {
                if (j <= num) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // for right side star
            // for (int j = 1; j <= i; j++) {
            // System.out.print(" ");
            // }
            System.out.println();
        }
    }
}