
// Prg to count total number of vowel in a word.
import java.util.*;

class VoweConsonantCount {
    public static void main(String args[]) {
        int vCount = 0, cCount = 0;
        String sentence;
        System.out.println("Enter a sentence :  ");
        Scanner sc = new Scanner(System.in);
        sentence = sc.nextLine();
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'A' || sentence.charAt(i) == 'a' || sentence.charAt(i) == 'E'
                    || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'O' || sentence.charAt(i) == 'o'
                    || sentence.charAt(i) == 'U' || sentence.charAt(i) == 'u') {
                vCount++; // increasing vowel value.
            } else if (sentence.charAt(i) == ' ') {
                continue;
            } else
                cCount++;
        }

        System.out.println("Total Number of vowel = " + vCount);
        System.out.println("Total Number of consonant = " + cCount);
        sc.close();
    }
}
