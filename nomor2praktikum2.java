import java.util.Scanner;

public class nomor2praktikum2 {
    public static void main(String[] args) {
        String[] nama = {"andi", "yanto", "yosu", "nanda", "damar"};
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan nama yang anda cari: "); String cari = inp.nextLine().toLowerCase();
        
        cariNama(nama, cari);
    }

    static void cariNama(String[] nama, String cari){
        boolean ditemukan = false;
        String hasil = "";

    for (int i = 0; i < nama.length; i++) {
        if (nama[i].contains(cari)) {
            // Gabungkan nama yang ditemukan ke dalam satu string
            hasil += nama[i] + "\n"; 
            ditemukan = true;
        }
    }

    if (ditemukan) {
        System.out.println("Hasil ditemukan:"); // Muncul cuma sekali
        System.out.print(hasil); // Cetak semua nama yang sudah dikumpulkan
    } else {
        System.out.println("Nama yang anda cari tidak ada");
    }
    }
}
