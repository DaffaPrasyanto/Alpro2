
import java.io.*;
import java.util.Scanner;

public class Praktikum1404 {
    public static void main(String[] args) {
        System.out.println("Program dimulai");

        try{
            System.out.println("\nmasuk ke blok try");
            int hasil = 10 / 2;
            System.out.println("Ini tidak akan dieksekusi");
        }
        catch(ArithmeticException e){
            System.out.println("Masuk ke blok catch");  
            System.out.println("Terjadi error: "+ e.getMessage());
        }
        finally{
            System.out.println("\nMasuk ke blok finally (Ini selalu dieksekusi)");
        }
        System.out.println("program selesai di eksekusi");

        // NOMOR 2
        try {
            processPayment(-100);
        } catch (IllegalArgumentException e) {
            System.out.println("Transaksi gagal: "+ e.getMessage());
        }
        finally{
            System.out.println("Log transaksi disimpan ke database");
        }

        // Nomor 3
        try {
            baca("data.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan");
        }
    }

    // nomor 2
    static void processPayment(int amount) {
        if(amount<= 0){
            throw new IllegalArgumentException(
                "\nJumlah pembayaran tidak valid: "+amount
            );
        }
        System.out.println("Memproses pembayaran: Rp"+amount);
    }

    static void baca(String namaFile)throws FileNotFoundException{
        File file = new File(namaFile);
        Scanner inp = new Scanner(file);

        while(inp.hasNextLine()){
            System.out.println(inp.nextLine());
        }
        inp.close();
    }

}
