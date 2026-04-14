import java.util.*;
public class tugasPraktikum2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] data = new int[10];
        for (int i = 0; i < 10; i++) {
            data[i] = rand.nextInt(100);
        }
        tampilan(data);   
    }


    static void tampilan(int[] data){
        System.out.println("Data yang belum terurut: "+Arrays.toString(data));
        bubbleSort(data);
        System.out.println("Data yang terurut menggunakan bubble sort: "+Arrays.toString(data));
        acakData(data);
        System.out.println("Data yang belum terurut: "+Arrays.toString(data));
        selectionSort(data);
        System.out.println("Data yang terurut menggunakan selection sort: "+Arrays.toString(data));
        acakData(data);
        System.out.println("Data yang belum terurut: "+Arrays.toString(data));
        insertionSort(data);
        System.out.println("Data yang terurut menggunakan insertion sort: "+Arrays.toString(data));
        
    }

    static void acakData(int[] data){
        Random rand = new Random();
        for(int i = data.length -1; i>0; i--){
            int j = rand.nextInt(i+1);
            int temp = data[i];
            data[i] = data[j];
            data[j] = temp;
        }
    }

    static void bubbleSort(int[] data){
        int temp = 0;
        for(int i = 0; i < data.length - 1; i++){
            for(int j = 0; j < data.length - i - 1 ; j++){
                if(data[j]>data[j+1]){
                    temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }

    static void selectionSort(int[] data){
        int n = data.length;
        for(int i = 0; i<n; i++){
            int min = i;
            for(int j = i+1; j<n; j++){
                if(data[j]<data[min]){
                    min = j;
                }
            }
            int temp = data[i];
            data[i] = data[min];
            data[min] = temp;
        }
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
}
