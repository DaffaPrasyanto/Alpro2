import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,8,5,3,2,6,1,7};
        selectionSort(arr);
    }

    public static void selectionSort(int[]arr){
        int indeksMin;
        for (int i = 0; i < arr.length - 1; i++) {
            indeksMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[indeksMin] < arr[j]) {
                    indeksMin = j;
                }
            }
            int temp = arr[indeksMin];
            arr[indeksMin] = arr[i];
            arr[i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
