// Pattern printing.
// Floyd's triangle with number.

/*
    1 
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15
*/

class PatternPrint_8 {
    public static void main(String args[]) {
        int num = 5;
        int number = 1;

        // outer loop -> for row.
        for (int i = 1; i <= num; i++) {
            // inner loop -> for value count.
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++; // this is used for increment the value. by 1.
            }
            System.out.println();
        }
    }
}