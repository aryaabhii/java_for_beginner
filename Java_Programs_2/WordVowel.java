// Prg to display each vowel and consonant within a sting.

import java.util.*;

class WordVowel {
    public static void main(String args[]) {
        String word;
        char chrcte;
        System.out.println("Enter a word : ");
        Scanner sc = new Scanner(System.in);
        word = sc.next();
        chrcte = word.charAt(0);
        char alphabet = chrcte;
        if (alphabet == 'A' || alphabet == 'a' || alphabet == 'E' || alphabet == 'e' || alphabet == 'I'
                || alphabet == 'i' || alphabet == 'O' || alphabet == 'O' || alphabet == 'U' || alphabet == 'u') {
            System.out.println("An " + word);
        } else {
            System.out.println("A " + word);
        }
        sc.close();
    }
}