public class InsertSort {
    public static void main(String[] args){
        int[] array = { 7, 8, 5, 2, 4, 6, 3 };
        sort(array);
    }
    public static void sort(int[] array){
        for( int idx = 1; idx < array.length; idx ++ ){
            int k = idx - 1;
            int min = array[idx];
            while( k >= 0 && min < array[k] ){
                int temp = array[k];
                array[k] = array[k + 1];
                array[k + 1] = temp;
                k --;
            }
        }
        for( int i = 0; i < array.length; i ++ ){
            System.out.print(array[i] + " ");
        }
    }
}
