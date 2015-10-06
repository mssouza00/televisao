/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package televisao;

import java.util.Scanner;

/**
 *
 * @author Priscila
 */
public class Televisao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TV tela = new TV();
        Scanner tc = new Scanner(System.in);
        int controle=0;
        
        do {
            
            
            System.out.println("1 - Ligar TV \n"+
                    "2 - almentar volume \n"+
                    "3 - diminuir volume \n"+
                    "4 - mudar de canal \n"+
                    "5 - Desligar tv \n"+
                    "6 - Estado da televisão");
            controle=tc.nextInt();
            switch (controle){
                
                case 1:
                    
                    tela.Ligar();
                    tela.ImprimiEstado();
                    break;
                case 2:
                    
                    tela.AlmentarVolume();
                    System.out.println("Volume "+tela.getVolume());
                    break;
                case 3:
                    tela.DiminuirVolume();
                    System.out.println("Volume "+tela.getVolume());
                    break;
                   
               case 4:
                   int canal =tc.nextInt(); 
                   if (canal>=0 &&canal<=99) {
                       tela.AlterarCanal(canal);
                   }
                   else {System.out.println("canal não existe");}
               break;
               case 5:
                   tela.Desligar();
                   tela.ImprimiEstado();
                   break;
               case 6:
                   tela.ImprimiEstado();
                   break;
            }
            
        } while (controle!=600);
        
    }
    
}
