package roma;

import roma.guided.guided1.agregasi.Jurusan;
import roma.guided.guided1.agregasi.Mahasiswa;

public class Main {
    public static void main(String[] args) {
        // Pembuatan objek tidak menggunakan label "NIM:" atau "Nama:" di Java
        Mahasiswa m1 = new Mahasiswa("103132400025", "Roma"); 
        Mahasiswa m2 = new Mahasiswa("103112400140", "Roma");
        
        Jurusan prodi = new Jurusan("SD", "Sains Data");
        
        // Memasukkan mahasiswa ke dalam jurusan
        prodi.addMahasiswa(m1);
        prodi.addMahasiswa(m2);
        
        // Menampilkan data
        prodi.displayMahasiswa();
    }
}