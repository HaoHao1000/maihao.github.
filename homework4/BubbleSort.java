public class BubbleSort {
    public static void main(String[] args){
        int[] array = { 7, 8, 5, 2, 4, 6, 3 };
        sort(array);
    }
    public static void sort( int[] arr ){
        for( int idx = 0; idx < arr.length - 1; idx ++ ){
            int imin = idx;
            for( int j = idx + 1; j < arr.length; j ++ ){
                if(arr[j] < arr[idx]){
                    int temp = arr[j];
                    arr[j] = arr[idx];
                    arr[idx] = temp;

                }
            }
        }
        for(int i = 0; i < arr.length; i ++){
            System.out.print(arr[i] + " ");
        }
    }
}
