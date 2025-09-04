/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstrack;

/**
 *
 * @author Salimatuz Zahwah
 */
abstract class Manusia {

    String nama;
    int umur;

    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    abstract void identitas();

    void nama() {
        System.out.println("Nama Mahasiswa: " + nama + "Umur Mahasiswa: " + umur);
    }

}
