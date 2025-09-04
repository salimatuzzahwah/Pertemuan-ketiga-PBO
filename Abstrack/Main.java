/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstrack;

/**
 *
 * @author Salimatuz Zahwah
 */
public class Main {

    public static void main(String args[]) {
        Mahasiswa_Si rajin = new Mahasiswa_Si("Alif ", 19, "Sistem Informasi");

        System.out.println("IDENTITAS MAHASISWA");
        rajin.identitas();
        rajin.berbicara("Halo Saya Mahasiswa");

        System.out.println("");
        System.out.println("KEGIATAN ALIF");
        rajin.berperanSebagai();
        rajin.Kebiasaansehari_hari();
        rajin.belajar();
        rajin.berjalan();
        rajin.melakukanHobi();
        rajin.bekerja();
    }
}
