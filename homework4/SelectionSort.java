public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {7, 8, 5, 2, 4, 6, 3};
        selectSort(array);

    }

    public static void selectSort(int[] array) {

        for (int idx = 0; idx < (array.length - 1); idx++) {
            int imin = idx;
            int min = array[idx];
            for (int j = idx + 1; j < array.length; j++) {
                if (array[j] < min) {
                    imin = j;
                    min = array[j];
                }

                if (min < array[idx]) {
                    int temp = array[imin];
                    array[imin] = array[idx];
                    array[idx] = temp;

                }
            }


        }
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " ");
        }

    }
}
