/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Abstrack;

/**
 *
 * @author Salimatuz Zahwah
 */
abstract class Hobi extends Pekerjaan {

    public Hobi(String nama, int umur) {
        super(nama, umur);
    }
    abstract void melakukanHobi();

    void Kebiasaansehari_hari() {
        System.out.println("Alif sering membaca buku perpustakaan");
    }

}
