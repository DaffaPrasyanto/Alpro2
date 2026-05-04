package daffaprasyanto.tugas4praktikum;
public class Website {
    String namaPemilik;
    String waktuBerlangganan;
    String metodePembayaran;
    
    public Website(String namaPemilik, String waktuBerlangganan, String metodePembayaran){
        this.namaPemilik = namaPemilik;
        this.waktuBerlangganan = waktuBerlangganan;
        this.metodePembayaran = metodePembayaran;
    }
    
    public void tampilkanInfo(){
        System.out.println("----- INFORMASI AKUN -----");
        System.out.println("Nama: "+namaPemilik);
        System.out.println("Durasi berlangganan: "+waktuBerlangganan);
        System.out.println("Metode Pembayaran: "+metodePembayaran);
    }
}
