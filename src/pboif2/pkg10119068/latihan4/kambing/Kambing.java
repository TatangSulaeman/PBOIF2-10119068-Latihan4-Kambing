/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119068.latihan4.kambing;

/**
 *
 * @author amtat
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Kambing
 */
public class Kambing {
    public void tambahKambing(){
        //Deklarasi variabel lokal
        int jumlahKambing = 0;
    
        jumlahKambing = jumlahKambing + 5 ;
        System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
    }
    public static void main(String[] args) {
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
    }
}




