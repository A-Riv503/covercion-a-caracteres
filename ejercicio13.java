/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ariel
 */
import java.util.Scanner;
public class ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* pide al usuario una frace y que pase sus caracteres a un array de caracteres */
        
        Scanner lector=new Scanner(System.in);
        String frace;
        System.out.println("ingrese una frace");
        frace=lector.nextLine();
        char caracteres[]=new char[frace.length()];
        for(int i=0;i<frace.length();i++){
          caracteres[i]=frace.charAt(i);
          System.out.println(caracteres[i]);
        }
        
       
        
        
        
    }
    
}
