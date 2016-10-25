/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecte;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Projecte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner ent=new Scanner(System.in);
    int num1 , num2 , num3 , programa;
    
    System.out.println("1 . Afegir Anime");
    System.out.println("2 . Borrar Anime");
    System.out.println("3 . Modificar Anime");
    System.out.println("4 . Visualitzar Animes");
    System.out.println("5 . Sortir del programa");
    
    
    System.out.println("Introduiu l'operació desitgada.");
    programa=ent.nextInt();
    
    while(programa < 5){
    switch (programa) {
        case '1':   
            break;
        case '2':
            break;
        case '3':
            break;
        case '4':
            break;
        default:
            System.out.println("Introduïr un altre anime? 1-Si 2-No");
            num3=ent.nextInt();
    }
    }
    
    }
    
}
