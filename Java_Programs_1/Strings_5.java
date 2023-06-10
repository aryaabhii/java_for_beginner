// Example of Strings.

class Strings_5 {
    public static void main(String args[]) {
        String sentence = "Hello, My name is John Ebraham.";
        // example of substring
        // we use this concept to extract a particular string.
        String name = (sentence.substring(18, sentence.length() - 1));
        System.out.println(name);
    }
}