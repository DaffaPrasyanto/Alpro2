import java.util.*;
public class belajarETS{
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner inp = new Scanner(System.in);
        int[] data = new int[10];
        for(int i = 0; i<data.length;i++){
            data[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(data));
        insertionSort(data);
        System.out.println("Data yang sudah di urutkan: "+Arrays.toString(data));
        System.out.print("Masukkan angka yang anda cari: "); int target = inp.nextInt();
        int indeks = binarySearch(data, target);
        System.out.println("Data yang anda cari ada di-"+(indeks+1));
        
    }

    static void insertionSort(int[] data){
        int n = data.length;
        for (int i = 1; i < n; i++) {
            int key = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = key;
        }
    }

    static int binarySearch(int[] data, int target){
        int low = 0;
        int high = data.length-1;
        while(low<=high){
            int mid = (low + high)/2;
            if(data[mid]==target){
                return mid;
            }else if(data[mid]<target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }
}