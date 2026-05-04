package daffaprasyanto.tugas4praktikum;
import java.util.Scanner;
public class Tugas4praktikum {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        // Nomor 1
//        System.out.println("Masukan jenis bangun: "); String bangun = inp.nextLine();
//        System.out.println("Masukkan panjang bangun: "); double panjang = inp.nextDouble();
//        System.out.println("Masukkan tinggi bangun: "); double tinggi = inp.nextDouble();
//        Geometri barang = new Geometri(bangun, panjang, tinggi);
//        barang.tampilkanInfo();
        
        // Nomor 2
        System.out.println("Masukkan Nama: "); String nama = inp.nextLine();
        System.out.println("Berapa Lama Durasi Berlangganan: "); String durasi = inp.nextLine();
        System.out.println("Metode Pembayaran: "); String metode = inp.nextLine();
        Website akun = new Website(nama, durasi, metode);
        akun.tampilkanInfo();
    }
}
