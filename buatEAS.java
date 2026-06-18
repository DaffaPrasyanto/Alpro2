class Bentuk {
    String Warna;
    
    public Bentuk(String x) {
        System.out.println("Konstruktor Bentuk dipanggil");
        // Melengkapi isian: memasukkan nilai parameter x ke atribut Warna
        this.Warna = x; 
    }
}

class Persegi extends Bentuk {
    private int sisi;
    
    public Persegi(String A, int B) {
        // Melengkapi isian: memanggil konstruktor parent (Bentuk) yang menerima 1 parameter String
        super(A); 
        
        System.out.println("Konstruktor Persegi dipanggil");
        // Melengkapi isian: memasukkan nilai parameter B ke atribut sisi
        this.sisi = B; 
    }

    public void info() {
        System.out.println("Warna persegi adalah : " + Warna);
        System.out.println("Ukuran adalah : " + sisi);
    }
}
public class buatEAS {
    public static void main(String[] args) {
        Persegi A = new Persegi("Merah", 8);
        A.info();
    }
}
