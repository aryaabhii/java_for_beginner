// Prg to perform sum using command line argument.....
class CommandLineArgumentSum {
    public static void main(String args[]) {
        if (args.length > 0) {
            int f = Integer.parseInt(args[0]); // Here Integer.parseInt is used to convert string into Integer..
            // Here Interger is Ineger is wrapper class and Int is function..which is used
            // to convert the agrs[] value in string which is in string...
            int s = Integer.parseInt(args[1]);
            int r = f + s; // here in f the value of args[0] & in s args[1]
            System.out.println("Sum of " + f + " + " + s + " = " + r);
        } else {
            System.out.println("Sorry! You didn't specified any arguments..");
        }
    }
}