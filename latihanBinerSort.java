import java.util.*;
public class latihanBinerSort {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Random rand = new Random();
        int[] angka = new int[10];
        for(int i = 0; i < angka.length; i++){
            angka[i] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(angka));
        bubblesort(angka);
        System.out.println(Arrays.toString(angka));
        System.out.print("Masukkan angka yang ingin dicari: "); int target = inp.nextInt();
        int indeks = search(angka, target);
        if(indeks != -1){
            System.out.println("angka anda ditemukan di "+ (indeks+1));
        }else{  
            System.out.println("angka anda tidak ditemukan");
        }

    }

    public static void bubblesort(int[] angka){
        int temp = 0;
        for(int i = 0; i < angka.length; i++){
            for(int j = 0; j < angka.length - i - 1; j++){
                if(angka[j]>angka[j+1]){
                    temp = angka[j];
                    angka[j] = angka[j+1];
                    angka[j+1] = temp; 
                }
            }
        }
    }

    public static int search(int[] angka, int target){
        int low = 0;
        int high = angka.length - 1;

        while(low<=high){
            int mid = (low + high)/2;
            if(angka[mid] == target){
                return mid;
            }else if(angka[mid]<target){
                low = mid + 1;
            }else{
                high = mid -1;
            }
        }
        return -1;
    }
}
