/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author Administator
 */
public class Balok extends PersegiPanjang implements MenghitungRuang{
    
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }  

    public Balok(){
        
    }
    
    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public double volume() {
        return super.lebar*super.panjang*tinggi;
    }

    @Override
    public double luas() {
        return 2*(super.luas()+(super.lebar*tinggi)+(super.panjang*tinggi));
    }   
  
}
