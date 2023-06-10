// Update Bits.

import java.util.Scanner;

class BitManipulation_4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        // oper = 1: set oper = 0 : clear
        int n = 5; // 0101 -> 0111 -> dec 7
        int pos = 1;

        int bitMask = 1 << pos;
        if (oper == 1) {
            // set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            // clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
        sc.close();
    }
}