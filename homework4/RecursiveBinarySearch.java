public class RecursiveBinarySearch {
    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
        int midddleIdx = (fromIdx + toIdx) / 2;
        if (fromIdx > toIdx) {
            return false;
        }
        if (array[midddleIdx] == key) {
            return true;
        }
        if (array[midddleIdx] > key) {
            return binarySearch(array, key, fromIdx, midddleIdx - 1);
        } else {
            return binarySearch(array, key, midddleIdx + 1, toIdx);
        }

    }

    public static boolean binarySearch(int[] array, int key) {
        return binarySearch(array, key, 0, array.length - 1);
    }

    public static void main(String[] args) {
        int[] array = {11, 14, 16, 18, 20, 25, 28, 30, 34, 40, 45};
        System.out.println(binarySearch(array, 14));
        System.out.println(binarySearch(array, 18));
        System.out.println(binarySearch(array, 25));
    }
}
