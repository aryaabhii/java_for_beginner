// Example of array.
class Array_1 {
    public static void main(String args[]) {
        // array declaration.
        int marks[] = new int[3];
        // int[] marks = new int[3]; another way of declaration.
        // int marks[] = {90,80, 60}; one another way of declaration.
        marks[0] = 90; // eng marks
        marks[1] = 80; // comp marks
        marks[2] = 60; // sci marks

        // // printing the value.
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // printing areay value using loop
        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }
    }
}
