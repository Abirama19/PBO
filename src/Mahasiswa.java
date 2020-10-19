/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Administator
 */
class data{
    String nama;
    private int nim;
    private String alamat;
    private float nilaiuts;
    private float nilaiuas;
    
    Scanner mahasiswa = new Scanner (System.in);
    
    public void methodData(){
        mahasiswa.nextLine(); 
        System.out.print("Input Nama : ");
        this.nama = mahasiswa.nextLine();
        System.out.print("Input Nim : ");
        this.nim = mahasiswa.nextInt();mahasiswa.nextLine(); 
        System.out.print("Input Alamat : ");
        this.alamat = mahasiswa.nextLine();
        System.out.print("Input Nilai UTS : ");
        this.nilaiuts = mahasiswa.nextFloat();
        System.out.print("Input Nilai UAS : ");
        this.nilaiuas = mahasiswa.nextFloat();

    }
    public void Output(){
       System.out.println("Nama        :  " + this.nama);
       System.out.println("Nim         :  " + this.nim);
       System.out.println("Alamat      :  " + this.alamat);
       System.out.println("Nilai Uts   :  " + this.nilaiuts);
       System.out.println("Nilai Uas   :  " + this.nilaiuas);
    }
}

public class Mahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int menu = 0;
        int a=0;
        Scanner masukanmenu = new Scanner(System.in);
        Scanner kembalimenu = new Scanner(System.in);
        data mhs = new data();
        
        mhs.methodData();
        
do{
    System.out.println("1.Lihat Data\n2. Edit Data");
    menu = masukanmenu.nextInt();
        if(menu==1){
            mhs.Output();
        }
        else if (menu==2) {
            mhs.methodData();
        }
    System.out.println("Back to menu ? (y/n)");
        a = kembalimenu.nextInt();
    }
while(a=='y');
}
}
