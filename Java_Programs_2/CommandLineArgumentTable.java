// Prg to print the table using commandline argumnent.....
class CommandLineArgumentTable {
    public static void main(String args[]) {
        int num = Integer.parseInt(args[0]);
        if (args.length > 0) {
            System.out.println("Table of [" + num + "] :");
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " * " + i + " = " + i * num);
            }
        } else {
            System.out.println("Sorry! You didn't specified any arguments..");
        }
    }
}