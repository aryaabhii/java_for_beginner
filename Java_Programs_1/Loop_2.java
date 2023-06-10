// Program based on for loop in java.

class Loop_2 {
    public static void main(String args[]) {
        System.out.println("Prgram based on For Loop. \n");

        // Scanner sc = new Scanner(System.in);

        // For loop function..
        System.out.println("Printing counting using for loop. \n");
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }
        System.out.println("\n");

        // While loop
        int i = 0;
        System.out.println("Printing counting using while loop. \n");
        while (i <= 10) {
            System.out.println(i);
            i = i + 1;
        }

        // Do while
        System.out.println("Printing counting using Do while loop..\n");
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}