/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosclase2;

import java.util.Scanner;

/**
 *
 * @author Junior Aguilar
 */
public class EjemplosClase21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // No olvidar ingresar valores
        
        String nombre;
        String apellido;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor ingresar sus nombres");
        nombre = entrada.nextLine();
        
        System.out.println("Por favor ingresar sus apellidos");
        apellido = entrada.nextLine();
        
        System.out.println("Su nombre es: "+nombre+"\n\n\t"+"Su apellido "
                +"es: "+apellido);
        
       
       
        
        
    }
    
}
