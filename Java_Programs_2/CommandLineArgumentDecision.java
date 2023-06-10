// Program based on decison making using Command Line argumnet......
class CommandLineArgumentDecision {
    public static void main(String args[]) {
        if (args.length > 0) {
            int age = Integer.parseInt(args[0]);
            if (age >= 18) {
                System.out.println("Congrats! You are eligible to vote...");
            } else {
                System.out.println("Sorry! You are not eligible to vote...");
            }
        } else {
            System.out.println("Sorry! You didn't specified any arguments..");
        }
    }
}