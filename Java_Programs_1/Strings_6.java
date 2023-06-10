// Example of string builder.

class Strings_6 {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println("Your character : " + sb);

        // char at 0 index.
        System.out.println("Single character output :  " + sb.charAt(0));

        // set char at 0th index.
        sb.setCharAt(0, 'P');
        System.out.println("After set a character : " + sb);

        // insert character at any index.
        sb.insert(2, 'n');
        System.out.println("After insertion character : " + sb);

        // deletion of n.
        sb.delete(2,3);
        System.out.println("After deletion caracter : " + sb);
    }
}