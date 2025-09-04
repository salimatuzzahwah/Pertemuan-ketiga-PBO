/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OverloadOverride;

/**
 *
 * @author Salimatuz Zahwah
 */
class Kendaraan {
       // Overload 2
    void jalan(int kecepatan) {
        System.out.println("Kendaraan berjalan dengan kecepatan " + kecepatan + " km/jam.");
    }

    // Overload 3
    void jalan(String tujuan) {
        System.out.println("Kendaraan menuju ke " + tujuan + ".");
    }
}