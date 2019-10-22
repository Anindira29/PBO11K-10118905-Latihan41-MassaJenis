/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118905.latihan41.massajenis;

/**
 *
 * @author Fitri
 * Nama     : Anindira Dina Fitriani
 * Kelas    : IF11-K
 * Nim      : 10118905
 * Deskripsi: Program Massa Jenis
 */
public class PBO11K10118905Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus k = new Kubus();
        k.setSisi(5);
        k.setMassa(250);
        
        System.out.println("====== Massa Jenis Kubus ======");
        System.out.println("Sisi\t\t: "+ k.getSisi());
        System.out.println("Massa\t\t: "+ k.getMassa());
        System.out.println("");
        System.out.println("====== Hasil Perhitungan ======");
        System.out.println("Volume\t\t: "+ k.hitungVolume());
        System.out.println("Massa Jenis\t: "+ k.hitungMassajenis(k.getMassa(),k.hitungVolume()));
    }
    
}
