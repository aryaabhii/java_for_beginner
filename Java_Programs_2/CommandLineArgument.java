// Example of command line argument.......
class CommandLineArgument {
    public static void main(String args[]) {
        System.out.println("Hello! Welcome to command line argumenet program's..");
        // if we pass any agrument while running the program then the arguments will
        // print bt below code...
        // * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        // * for ex: java CommandLineArgument "Good Morning"
        // * the output will be :
        // * -> Hello! Welcome to command line argumenet program's..
        // * -> Good Morning
        // * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        // In above example only one argument I've passed i.e. Good Morning if I'll
        // pass more than one it'll print all data..

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}