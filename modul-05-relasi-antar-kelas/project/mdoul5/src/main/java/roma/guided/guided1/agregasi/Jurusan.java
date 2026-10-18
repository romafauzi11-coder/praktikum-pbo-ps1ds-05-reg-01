package roma.guided.guided1.agregasi;

public class Jurusan { // Perbaikan "puclic" menjadi "public"
    private int jumlahMahasiswa = 0;
    private String kodejurusan, namajurusan;
    // Perbaikan nama array agar konsisten
    private Mahasiswa[] daftarMahasiswa = new Mahasiswa[32]; 

    // Constructor
    public Jurusan(String kodejurusan, String namajurusan) { // Perbaikan "string" menjadi "String"
        this.kodejurusan = kodejurusan;
        this.namajurusan = namajurusan;
    }

    // Behavior
    public void addMahasiswa(Mahasiswa m) {
        this.daftarMahasiswa[jumlahMahasiswa] = m;
        jumlahMahasiswa++;
    }

    public void displayMahasiswa() {
        System.out.println("Kode jurusan: " + this.kodejurusan);
        System.out.println("Nama jurusan: " + this.namajurusan);
        System.out.println("Daftar mahasiswa: ");
        
        // Looping harus berada di dalam method
        for (int i = 0; i < jumlahMahasiswa; i++) {
            // Perbaikan pemanggilan getter dan format print
            System.out.println((i + 1) + ". " + daftarMahasiswa[i].getNIM() + " - " + daftarMahasiswa[i].getNama());
        }
    }

    // Getter
    public String getKodejurusan() {
        return kodejurusan; // Perbaikan return
    }

    public String getNamajurusan() {
        return namajurusan;
    }

    // Setter
    public void setKodejurusan(String kodejurusan) {
        this.kodejurusan = kodejurusan;
    }
     
    public void setNamajurusan(String namajurusan) {
        this.namajurusan = namajurusan; // Perbaikan assignment
    }
}