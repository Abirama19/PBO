/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

import java.util.Scanner;

/**
 *
 * @author Administator
 */
public class Tugas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        int pilih;
        char pilih2;
       
        Lingkaran lingkaran = new Lingkaran();
        PersegiPanjang pp= new PersegiPanjang();
        Balok balok = new Balok();
        Kerucut kerucut = new Kerucut();   
  
        do{
            System.out.println("INPUT :");
            System.out.println("1. Balok ");
            System.out.println("2. Kerucut ");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            pilih = keyboard.nextInt();
        
            switch(pilih){
                case 1 :
                    System.out.print("PANJANG = ");
                    balok.panjang = keyboard.nextDouble();
                    System.out.print("LEBAR = ");
                    balok.lebar = keyboard.nextDouble();
                    System.out.print("TINGGI = ");
                    balok.setTinggi(keyboard.nextDouble());
                    balok.getTinggi();
                    System.out.println("_________OUTPUT_________");
                    System.out.println("LUAS Persegi Panjang    : " + pp.luas());
                    System.out.println("KELILING Persegi Panjang: " + pp.keliling());
                    System.out.println("VOLUME BALOK            : " + balok.volume());
                    System.out.println("LUAS PERMUKAAN BALOK    : " + balok.luas());
                    break;
                
                case 2:
                    System.out.print("JARIJARI = ");
                    lingkaran.jarijari = keyboard.nextDouble();
                    System.out.print("TINGGI = ");
                    kerucut.setTinggi(keyboard.nextDouble());
                    kerucut.getTinggi();
                    System.out.println("_________OUTPUT_________");
                    System.out.println("LUAS LINGKARAN    : " + lingkaran.luas());
                    System.out.println("KELILING LINGKARAN: " + lingkaran.keliling());
                    System.out.println("VOLUME KERUCUT    : " +kerucut.volume());
                    System.out.println("LUAS PERMUKSSN KERUCUT : " +kerucut.luas());
                    break;
            
                case 3:
                    System.exit(0);
                    break;
                    
                default: System.out.println("salah input");
            }
            System.out.print("Input lagi? (y/n) : ");
            pilih2 = keyboard.next().charAt(0);
        }while(pilih2=='y' || pilih2=='Y');
   
    }
    
}
