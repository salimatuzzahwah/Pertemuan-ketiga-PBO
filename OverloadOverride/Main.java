/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OverloadOverride;

/**
 *
 * @author Salimatuz Zahwah
 */
public class Main {
    public static void main(String[] args) {
        // superlass (Overload)
        Kendaraan kendaraan = new Kendaraan();
      
        kendaraan.jalan(60);
        kendaraan.jalan("Bandung");

        System.out.println("----------------------");

        //subclass (Override)
        Mobil HondaCivic = new Mobil();
        
        HondaCivic.jalan();         
        HondaCivic.jalan(100);      
        HondaCivic.jalan("Apartemen");
    }
}