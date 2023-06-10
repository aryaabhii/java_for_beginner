// Example of sorting in java.

class SortingBubble {
    // function.
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 7, 8, 3, 1, 2 };

        // time complexity = 0(n^2).
        // bubble sort logic.
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) { // here one is decreasing bcz one element is sorted.
                if (arr[j] > arr[j + 1]) { // if the value of +1 indexed value then swap.
                    // swap.
                    int temp = arr[j]; // all value is stored in temp variable.
                    arr[j] = arr[j + 1]; // here putting value of next indexed value in array.
                    arr[j + 1] = temp; // temp value in j+1
                }
            }
        }
        printArray(arr);
    }
}