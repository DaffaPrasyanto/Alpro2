import java.util.*;
public class praktikum0704{
    public static void main (String[] args) {
       Scanner inp = new Scanner(System.in);
       int[] data = new int[10];
       Random rand = new Random();
       for(int i = 0; i<data.length;i++){
        data[i] = rand.nextInt(100);
       }
       System.out.println("Arrays yang belum keurut: "+Arrays.toString(data));
       System.out.println("Arrays yang sudah keurut: "+Arrays.toString(data));
       System.out.print("Masukkan angka yang ingin dicari: "); int target = inp.nextInt();
       System.out.print("Pengen gunain Binary Search (1) atau Linear Search (2): "); int pilih = inp.nextInt();
       pilihSearch(pilih, data, target);
    }

    static void pilihSearch(int pilih, int[] data, int target){
        if(pilih == 1){
            int indeks = binarySearch(data, target);
            System.out.println("Data yang anda cari ada diurutan ke-"+(indeks+1));
        }else if(pilih == 2){
            int indeks = linearSearch(data, target);
            System.out.println("data yang anda cari ada diurutan ke-"+(indeks+1));
        }
    }

    static int binarySearch(int[] data, int target){
        int low = 0;
        int high = data.length - 1;

        while(low<=high){
            int mid = (low+high)/2;
            if(data[mid]==target){
                return mid;
            }else if(data[mid]<target){
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
        return -1;
    }

    static int linearSearch(int[] data, int target){
        int k = 0;
        int n = data.length;
        boolean ketemu = false;
        while(k<n && ketemu == false){
            if(data[k]==target){
                ketemu = true;
                return k+1;
            }else{
                k+=1;
            }
        }
        if(ketemu == true){
            return k+1;
        }else{
            return -1;
        }
    }

    static void selectionSort(int[] data){
        int n = data.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for(int j=i+1; j<n; j++){
                if(data[j]<data[min]){
                    min = j;
                }
            }
            int temp = data[i];
            data[i] = data[min];
            data[min] = temp;
        }
    }
}