// Program based on array making using Command Line argumnet......
class CommandLineArgumentArray {
    public static void main(String args[]) {
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        } else {
            System.out.println("Sorry! You didn't specified any arguments..");
        }
    }
}