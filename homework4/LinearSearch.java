public class LinearSearch {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int key = 3;
        System.out.println(linearSearch(array, key));
        System.out.println(linearSearchIndex(array, key));
    }

    public static boolean linearSearch(int[] array, int key) {
        for (int i : array) {
            if (key == i) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
