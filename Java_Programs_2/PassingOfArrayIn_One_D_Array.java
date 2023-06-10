//  program to create a function sum() to sum all elements sored in 1-D Array..
class PassingOfArrayIn_One_D_Array {
    void sum(int array[]) {
        int sum = 0;
        System.out.println("\n ELEMENTS OF AN ARRAY ARE :-");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            sum += array[i];
        }
        System.out.println("Sum : " + sum);
    }

    public static void main(String args[]) {
        PassingOfArrayIn_One_D_Array obj = new PassingOfArrayIn_One_D_Array();
        int array[] = { 10, 5, 12, 9, 20, 50 };
        obj.sum(array);
    }
}