import java.util.Scanner;

// Prg to check weather given alphabet is vowel or consonant.
class VowelConsonant {
    public static void main(String args[]) {
        char alphabet;
        System.out.println("Enter an alphabet to check volwel or consonant : ");
        Scanner sc = new Scanner(System.in);
        alphabet = sc.next().charAt(0);
        if (alphabet == 'A' || alphabet == 'a' || alphabet == 'E' || alphabet == 'e' || alphabet == 'I'
                || alphabet == 'i' || alphabet == 'O' || alphabet == 'O' || alphabet == 'U' || alphabet == 'u') {
            System.out.println(alphabet + " is vowel.");
        } else {
            System.out.println(alphabet + " is consonant.");
        }
        sc.close();
    }
}