/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Mahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NPM : ");
        String npm = input.nextLine();
        System.out.print("Masukkan Nama Mahasiswa : ");
        String namaMhs = input.nextLine();
        System.out.print("Nilai Kehadiran  : ");
        double nilaiHdr = input.nextDouble();
        System.out.print("Nilai Tugas      : ");
        double nilaiTgs = input.nextDouble(); 
        System.out.print("Nilai UTS        : ");
        double nilaiUTS = input.nextDouble(); 
        System.out.print("Nilai UAS        : ");
        double nilaiUAS = input.nextDouble(); 
        
        double nilaiAkhir =  (0.10 * nilaiHdr) + (0.20 * nilaiTgs) +(0.30 * nilaiUTS) + (0.40 * nilaiUAS);
        String grade;
        if (nilaiAkhir >= 76) {
            grade = "A";
        } else if (nilaiAkhir >= 66) {
            grade = "B";
        } else if (nilaiAkhir >= 56) {
            grade = "C";
        } else if (nilaiAkhir >= 46) {
            grade = "D";
        } else {
            grade = "E";
        }
        
        String keterangan;
        if (nilaiAkhir >= 76) {
            keterangan = "ISTIMEWA";
        } else if (nilaiAkhir >= 66) {
            keterangan = "BAIK";
        } else if (nilaiAkhir >= 56) {
            keterangan = "CUKUP";
        } else if (nilaiAkhir >= 46) {
            keterangan = "KURANG";
        } else {
            keterangan = "KURANG SEKALI";
        }
        
        System.out.println(" \n");
        System.out.println("NPM Mahasiswa    : " +npm);
        System.out.println("Nama Mahasiswa   : " +namaMhs);
        System.out.println("Nilai Rata-Rata  : " +nilaiAkhir);
        System.out.println("Grade            : " +grade);
        System.out.println("Keterangan       : " +keterangan);

    }
    
}
