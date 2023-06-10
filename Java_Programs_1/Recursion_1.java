// Recursion examples.

class Recursion_1 {
    // function for recursion.
    public static void printNum(int n) {
        if (n == 0) { // base
            return;
        }
        System.out.println(n); // printing statement.
        printNum(n - 1); // resursion.
    }

    public static void main(String args[]) {
        int n = 5;
        printNum(n);
    }
}