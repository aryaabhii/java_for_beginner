// Program to find the greatest number using command line arguments....
class CommandLineArgumentGreatest {
    public static void main(String args[]) {
        if (args.length > 0) {
            int first = Integer.parseInt(args[0]);
            int second = Integer.parseInt(args[1]);
            int third = Integer.parseInt(args[2]);
            if (first > second)
                if (first > third) {
                    System.out.println(first + " is greatest..");
                } else {
                    System.out.println(third + " is greatest..");
                }
            else if (second > third) {
                System.out.println(second + " is greatest..");
            } else {
                System.out.println(third + " is greatest..");
            }
        } else {
            System.out.println("Sorry! You didn't specified any arguments..");
        }
    }
}