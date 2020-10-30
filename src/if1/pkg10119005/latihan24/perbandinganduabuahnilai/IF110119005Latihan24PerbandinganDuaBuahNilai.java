/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119005.latihan24.perbandinganduabuahnilai;

import java.util.Scanner;

/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 * Deskripsi Program : Sebuah program untuk membandingkan 2 buah nilai
 */
public class IF110119005Latihan24PerbandinganDuaBuahNilai {
    static final Scanner scan = new Scanner(System.in);
    int nilai1, nilai2;

    private void masukNilai(){
        System.out.println("=======Progaram Perbandingan Nilai=======");
        System.out.print("Masukkan nilai pertama : ");
        nilai1 = scan.nextInt();
        System.out.print("Masukkan nilai kedua : ");
        nilai2 = scan.nextInt();
    }

    private String perbandinganNilai(){
        return (nilai1 < nilai2) ? nilai1+" lebih kecil dari "+nilai2 :
                (nilai1 > nilai2) ? nilai1+" lebih besar dari "+nilai2 :
                        nilai1+" sama dengan "+nilai2;
    }

    private void Perbandingan(){
        System.out.print("\nUlangi Aktifitas ? (Ya/Tidak) : ");
        if(scan.next().equals("Ya")){
            System.out.print("\n");
            startMethod();
        }
    }

    private void tampilPerbandingan(String hasil){
        System.out.println("\nHasil : "+hasil);
    }

    private void startMethod(){
        masukNilai();
        tampilPerbandingan(perbandinganNilai());
        Perbandingan();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            IF110119005Latihan24PerbandinganDuaBuahNilai data = new IF110119005Latihan24PerbandinganDuaBuahNilai();
            data.startMethod();
	    System.out.println("Developed by : Hayin Ananta");
    }
    
}
