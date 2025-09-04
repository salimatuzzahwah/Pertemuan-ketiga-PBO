/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstrack;

/**
 *
 * @author Salimatuz Zahwah
 */
abstract class Pekerjaan extends Manusia {

    public Pekerjaan(String nama, int umur) {
        super(nama, umur);
    }
       abstract void bekerja();

    void berperanSebagai() {
        System.out.println("Alif berperan sebagai PJ Matakuliah PBO ");
    }
}
