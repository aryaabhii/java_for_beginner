// Example of string.

class Strings_8 {
    public static void main(String args[]) {
        // building character.
        StringBuilder sb = new StringBuilder("Hello");

        // string reverse.
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i; // first index.
            int back = sb.length() - 1 - i; // 5-1-0 = 4;0 (last index.)

            // extracting character.
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            // after extraction putting reversed character.
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        // outputting the value.
        System.out.println(sb);
    }
}