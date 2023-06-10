// Pattern printing.
// Number pyramid.

/*
        1 
       2 2    
      3 3 3   
     4 4 4 4  
    5 5 5 5 5        
*/

class PatternPrint_12 {
    public static void main(String args[]) {

        int num = 5;

        // outer loop for row.
        for (int i = 1; i <= num; i++) {

            // for space.
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }

            // for number -> print row number,row times.
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}
