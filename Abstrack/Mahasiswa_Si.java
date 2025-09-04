/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstrack;

/**
 *
 * @author Salimatuz Zahwah
 */
class Mahasiswa_Si extends Hobi implements Berbicara, Berjalan, Belajar {

    String jurusan;

    public Mahasiswa_Si(String nama, int umur, String jurusan) {
        super(nama, umur);
        this.jurusan = jurusan;
    }

    void identitas() {
        System.out.println("Nama: " + nama + ", Umur: " + umur + ", Jurusan: " + jurusan);
    }
    
    void bekerja() {
        System.out.println("");
    }
    
    void melakukanHobi(){
        System.out.println("");
    }

    @Override
    public void berbicara(String kata) {
        System.out.println(nama + "Berkata: " + kata);
    }
    @Override
    public void berjalan() {
        System.out.println(nama + "berjalan menuju lantai 8 untuk kelas algoritma ");
    }

    @Override
    public void belajar() {
        System.out.println(nama + "belajar materi abstrack dalam matakuliah PBO ");
    }  
}
