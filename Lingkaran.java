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
public class Lingkaran implements MenghitungBidang{
    public double jarijari;
    public float jarijari2;
    
    public Lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }

   public Lingkaran(){
       
   }

    @Override
    public double luas() {
        return jarijari*jarijari*Math.PI;
    }

    @Override
    public double keliling() {
        return 2*Math.PI*jarijari;
    }
    
    
}
