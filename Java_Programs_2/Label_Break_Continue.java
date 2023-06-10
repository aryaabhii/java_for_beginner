// Prg baed on label : break & continue ..
class Label_Break_Continue {
    public static void main(String[] args) {
        Bca1: for (int i = 1; i <= 5; i++) {
            // if (i == 5)
            // continue;
            Bca2: for (int j = 1; j <= 5; j++) {
                System.out.println("Value of i : " + i + "\t" + "Value of j : " + j);
                if (j == 3)
                    break Bca1;
            }
        }
    }
}