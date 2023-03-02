/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1;

/**
 *
 * @author isabe
 */
public class Pendaftaran {
    public static void main(String[] args) {
    Mahasiswa mhs = new Mahasiswa();
        mhs.nama="Ishabell";
        mhs.nobp="2101092051";
        mhs.kelas="B";
        mhs.prodi="Manajemen Informatika";
        mhs.jurusan="Teknologi Informasi";
        
        
        System.out.println("Nama : " +mhs.nama+ "\n"
                +"No BP : " +mhs.nobp+ "\n"
                    +"Jurusan : " +mhs.jurusan+ "\n"
                        +"Prodi : " +mhs.prodi+ "\n"
                            +"Kelas : " +mhs.kelas+ "\n");
}
}