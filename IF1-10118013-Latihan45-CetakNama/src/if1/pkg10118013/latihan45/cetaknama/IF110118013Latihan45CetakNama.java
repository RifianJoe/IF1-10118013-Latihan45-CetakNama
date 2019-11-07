/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118013.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author Rifian
 * Nama : Rifian Joe Premilenio
 * Kelas : IF-01
 * NIM : 10118013
 */
public class IF110118013Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Printer printer = new Printer();
        
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukkan nama anda : ");
        printer.setNama(input.nextLine());
        System.out.print("Mau cetak nama berapa kali? : ");
        printer.setJmlCetak(input.nextInt());
        
        printer.cetak(printer.getNama());
        printer.cetak(printer.getJmlCetak(), printer.getNama());
    }
    
}
