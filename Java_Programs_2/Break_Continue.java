// Prg based on break and continue..
class Break_Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 5)
                continue;
            for (int j = 1; j <= 5; j++) {
                System.out.println("Value of i : " + i + "\t" + "Value of j : " + j);
                if (j == 3)
                    break;
            }
        }
    }
}