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
public class IndeksMassaTubuh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("|====NILAI IMT====|=====KRITERIA=====|");
        System.out.println("|      <18,4      |Berat Badan Kurang|");
        System.out.println("|    18,5-24,9    |Berat Badan Ideal |");
        System.out.println("|     25-29,9     |Berat Badan Lebih |");
        System.out.println("|     30-39,9     |       Gemuk      |");
        System.out.println("|       >40       |   Sangat Gemuk   |");
        System.out.println("|=================|==================|");
        
        System.out.println("Masukkan Berat Badan (kg): ");
        double bb = input.nextDouble();
        
        System.out.println("Masukan Tinggi Badan (m) : ");
        double tb = input.nextDouble();
        
        double imt = bb / (tb * tb);
        
        String kriteria;
        if (imt < 18.5){
            kriteria = "Berat Badan Kurang";
        }else if(imt >= 18.5 && imt < 25){
            kriteria = "Berat Badan Ideal";
        }else if(imt >= 25 && imt < 30){
            kriteria = "Berat Badan Lebih";
        }else if (imt >= 30 && imt < 40){
             kriteria = "Gemuk";
        }else {
             kriteria = "Sangat Gemuk";
        }
        
        System.out.println("IMT Anda adalah          : " + imt);
        System.out.println("Kriteria                 : " + kriteria);
        
    }
    
}
