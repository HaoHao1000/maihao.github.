import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array1: ");
        int len = sc.nextInt();
        int[] array = new int[len];
        System.out.println("Enter numbers in array1: ");
        for (int idx = 0; idx < len; ++idx) {
            array[idx] = sc.nextInt();
        }
        Array printArray = new Array();
        printArray.print(array);
        System.out.println();
        System.out.println(printArray.contains(array, 3));
        System.out.println(printArray.search(array, 2));
    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int idx = 0; idx < array.length; idx++) {
            if (idx == ((array.length) - 1)) {
                System.out.print(array[idx]);
            } else {
                System.out.print(array[idx] + ",");
            }
        }
        System.out.print("]");
    }

    public static String toString(int[] a) {
        StringBuilder sb = new StringBuilder("[" + a[0]);
        for (int i = 1; i < a.length; i++) {
            sb.append(", ").append(a[i]);
        }
        return sb.append("]").toString();
    }

    public static boolean contains(int[] array, int key) {
        for (int idx = 0; idx < array.length; idx++) {
            if (array[idx] == key) {
                return true;
            }
        }
        return false;
    }

    public static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                return i;
            }
        }
        return -1;
    }

    public static boolean equals(int[] array1, int[] array2) {
        if (array1.length == 0 && array2.length == 0)
            return true;
        else {
            if (array1.length == array2.length)
                for (int i = 0; i < array1.length; i++)
                    if (array1[i] == array2[i])
                        return true;
        }
        return false;
    }

    public static int[] copyOf(int[] array) {
        int size = array.length;
        int[] newArray = new int[size];
        for (int idx = 0; idx < size; idx++) {
            newArray[idx] = array[idx];
        }
        return newArray;
    }

    public static boolean swap(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }
        return true;
    }
    public static void reverse(int[] array) {
        int[] newArray = new int[array.length];

        for (int fIdx = 0, bIdx = array.length - 1; fIdx < array.length; ++fIdx, bIdx--) {
            newArray[fIdx] = array[bIdx];
        }
        print(newArray);
    }
}
