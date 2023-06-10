// Program based on Looping Concept...

class Loop_1 {
    public static void main(String args[]) {

        // Printing hello world using for loop...
        for (int counter = 1; counter <= 3; counter = counter + 1) {
            System.out.println("Hello Wolrd");
        }

        System.out.println(" ");

        // Printing hello world using while loop...
        int counter = 0;
        while (counter < 3) {
            System.out.println("Hello World");
            counter = counter + 1;
        }

        System.out.println(" ");

        // Printing hello world using do while loop...
        do {
            System.out.println("hello World");
            counter++;
        } while (counter < 3);

    }
}
