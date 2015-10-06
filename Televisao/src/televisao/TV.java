/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package televisao;

/**
 *
 * @author Priscila
 */
public class TV {

    private boolean tv;
    private int Volume, canal;

    public TV() {
        
        tv = false;
        canal = 2;
        Volume = 10;
    }

    public void Ligar() {
        tv = true;
    }

    public void Desligar() {
        tv = false;

    }
    

    public void AlmentarVolume() {
        if (Volume < 99) {
            Volume++;

        }

    }

    public void DiminuirVolume() {
        if (Volume > 0) {
            Volume--;

        }

    }
    public void AlterarCanal(int Canal){
    
    canal=Canal;
    }
    public void ImprimiEstado(){
        if (tv) {
            System.out.println("tv ligada");
        }
        else{System.out.println("TV desligada");}
        System.out.println("Canal "+canal+" Volume "+Volume);
    }


    public int getVolume() {
        return Volume;
    }

    public int getCanal() {
        return canal;
    }
    
}
