public class SelectionSort {
    public static void main(String[] args) {
        int array[] = {3, 5, 2, 1, 9, 7, 8 , 6, 4};
        //int[] ar = new int[4];

        selSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public static void selSort(int[] array) {
        
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
            
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

    }
}
