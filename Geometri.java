package daffaprasyanto.tugas4praktikum;
public class Geometri {
    String nama;
    double panjang;
    double tinggi;
    
    public Geometri(String nama, double panjang, double tinggi){
        this.nama = nama;
        this.panjang = panjang;
        this.tinggi = tinggi;
    }
    public double luas(){
        if(nama.equalsIgnoreCase("Segitiga")){
            return 0.5*panjang*tinggi;
        }else{
            return panjang*tinggi;
        }
    }
    public double keliling(){
        if(nama.equalsIgnoreCase("segitiga")){
            double miring = Math.sqrt(Math.pow(panjang, 2)+ Math.pow(tinggi, 2));
            return panjang+miring+tinggi;
        }else{
            return 2*(panjang+tinggi);
        }
    }
    public void tampilkanInfo(){
        System.out.println("---Geometri Bangun Datar---");
        System.out.println("Nama Bangun: "+nama);
        System.out.println("Panjang Bangun: "+panjang);
        System.out.println("Tinggi Bangun: "+tinggi);
        System.out.println("Luas bangun: "+luas());
        System.out.println("Keliling bangun: "+keliling());
    }
}
