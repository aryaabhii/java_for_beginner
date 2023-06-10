// Example of Strings.

class Strings_4 {
    public static void main(String args[]) {
        String name1 = "Abhijeet";
        String name2 = "Abhijeet";

        // conditions check internally by JVM.
        // 1 : name1 > name2 then return +ve
        // 2 : name1 == name2 then return 0
        // 3 : name1 < name2 then return -ve

        // comparision between two string.
        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }
    }
}