/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117126.latihan52.siapakamu;

/**
 *Nama  : Mawa Faqu Rohcman
 *Kelas : IF-1
 *NIM   : 10117126
 *Deskripsi Program: program ini berisi program yang menampilkan informasi 
 *                   dosen dan mahasiswa
 */
public class IF110117126Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen dosen = new Dosen();
        dosen.setNIP("41227829930");
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        System.out.println("NIP DOSEN = " + dosen.getNIP());
        dosen.siapaKamu();
        dosen.mengajarApa();

        System.out.println("");

        Mahasiswa mhs = new Mahasiswa();
        mhs.setNIM("10117126");
        mhs.setNama("Mawa Faqu Rochman");
        mhs.setUmur(21);
        mhs.setKelas("IF-1");
        System.out.println("NIM MAHASISWA = " + mhs.getNIM());
        mhs.siapaKamu();
        mhs.kelasApa();
    }

}
