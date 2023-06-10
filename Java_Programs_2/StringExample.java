// Exmaple of string in java..
class StringExample {
    public static void main(String args[]) {
        // due to string pull creation by machine same contents will referred by same
        // variable.
        String s = "  Hello! Java.  ";
        String s1 = "Hello! Java.";
        String s2 = s1; // s2 will store the data of s1..
        String s3 = new String("Java Developement Kit.");
        System.out.println("\nData of S  : " + s);
        System.out.println("Data of S1 : " + s1);
        System.out.println("Data of S2 : " + s2);
        System.out.println("Data of S3 : " + s3 + "\n");

        System.out.println("Class of the Data : ");
        System.out.println(s + " [belongs to " + s.getClass() + "]"); // it will tell's the class...
        System.out.println(s3 + " [belongs to " + s3.getClass() + "]"); // it will tell's the class...
        System.out.println("GET CLASS EXMAPLE".getClass() + "\n"); // it will tell's the class...

        System.out.println("Hashcode  : ");
        System.out.println(s.hashCode()); // it will give the uique hashcode which is genrated by system.
        System.out.println(s1.hashCode()); // it will give the uique hashcode which is genrated by system.
        System.out.println(s2.hashCode()); // it will give the uique hashcode which is genrated by system.
        System.out.println(s3.hashCode()); // it will give the uique hashcode which is genrated by system.
        // But above three hascode will same value bcz their data is same in s, s1, s2
        // so the code is same.
        System.out.println("GET CLASS EXMAPLE".hashCode() + "\n"); // it's code will be different bcz here the data is
                                                                   // differ
        // from the above data that's the reason.

        System.out.println("Length  : ");
        System.out.println("Length  of [GET CLASS EXMAPLE] : " + "GET CLASS EXMAPLE".length()); // it will return the
                                                                                                // length of string.
        System.out.println("Length of S                    : " + s.length());
        System.out.println("Length of S1                   : " + s1.length());
        System.out.println("Length of S2                   : " + s2.length());
        System.out.println("Length of S3                   : " + s3.length() + "\n");

        System.out.println("Matching the String [If same then true if not then false]  : ");
        // it will match the data if match then return boolean true & false.
        System.out.println(s1 + " & " + s + " [" + s1.equals(s) + "]"); // return true bcz same character.
        System.out.println(s1 + " & " + s3 + " [" + s1.equals(s3) + "]"); // return false bcz not same character.
        System.out.println(s3.toUpperCase()); // here is will convert in upper case.
        System.out.println(s3); // This is imutable so in original data no any changes will be reflected.
        System.out.println(s1.toLowerCase()); // here is will convert in lower case.
        System.out.println(s1); // This is imutable so in original data no any changes will be reflected.
        System.out.println(s.trim().length()); // trim() function will remove the space from begining & end.
        System.out.println(s3.charAt(2)); // this will return the character from index 2.
        System.out.println(s3.indexOf('e')); // it will return the index of 'e'.
        System.out.println(s.substring(6)); // it will start writing from index number 6.
        System.out.println(s.substring(2, 8)); // it will start from index no. 2 & stop at index no 8.
    }
}