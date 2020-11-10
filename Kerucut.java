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
public class Kerucut extends Lingkaran implements MenghitungRuang{

    private double tinggi;

    public Kerucut(double jarijari, double tinggi) {
        super(jarijari);
        this.tinggi = tinggi;
    }

    public Kerucut(){
        
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }
    
    @Override
    public double volume() {
        return Math.PI*super.jarijari*super.jarijari*tinggi*(1/3);
    }

    @Override
    public double luas() {
        double sisiMiring = Math.sqrt((super.jarijari*super.jarijari)+(tinggi*tinggi));    
        return (Math.PI*super.jarijari*(super.jarijari+sisiMiring));
    }    
}
