// Program to calculate the sum which is stored in array using commandline
// argument which using var args.....
class CommandLineArgumentArraySum {
    public static void main(String... args) {
        double array[] = new double[args.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Double.parseDouble(args[i]);
        }
        double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum of " + array[0] + " + " + array[1] + " = " + sum);
    }
}