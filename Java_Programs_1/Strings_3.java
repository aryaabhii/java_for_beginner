// Example of string.

class Strings_3 {
    public static void main(String args[]) {
        String firstName = "Abhijeet";
        String lastName = "Kumar";

        // concatenation.
        String fullName = firstName + " " + lastName;

        // charAt function.
        // prting character line by line.
        System.out.println("Your characters are as : ");
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
    }
}
