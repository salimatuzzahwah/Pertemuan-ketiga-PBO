/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OverloadOverride;

/**
 *
 * @author Salimatuz Zahwah
 */
class Mobil extends Kendaraan {
    // Override method jalan()

    void jalan() {
        System.out.println("(Mobil)Honda Civic melaju di jalan jakarta dengan nyaman.");
    }

    // Override jalan(int kecepatan)
    @Override
    void jalan(int kecepatan) {
        System.out.println("(Mobil) Honda Civic melaju dengan kecepatan " + kecepatan + " km/jam menggunakan mesin bensin.");
    }

    // Override jalan(String tujuan)
    @Override
    void jalan(String tujuan) {
        System.out.println("(Mobil) Honda Civic menuju ke " + tujuan + " dengan GPS.");
    }
}
