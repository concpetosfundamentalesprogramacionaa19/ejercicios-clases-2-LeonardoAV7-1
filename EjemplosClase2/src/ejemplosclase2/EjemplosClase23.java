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
public class EjemplosClase23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // No olvidar ingresar valores
        
        String nombre;
        String apellido;
        int edad;
        String ciudad;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor ingresar sus nombres");
        nombre = entrada.nextLine();
        
        System.out.println("Por favor ingresar sus apellidos");
        apellido = entrada.nextLine();
        
        System.out.println("Por favor ingresar su edad");
        edad = entrada.nextInt();
        entrada.nextLine(); // limpieza del buffer de entrada de datos
        
        System.out.println("Por favor ingresar su ciudad");
        ciudad = entrada.nextLine();
        
        /**
        System.out.println("Su nombre es: "+nombre+"\n\n\t"+"Su apellido "
                +"es: "+apellido+", edad: "+edad+"\n"+"Ciudad: "+ciudad);
        */
        
        System.out.printf("Su nombre es: %s \n\n\tSu apellido es: %s, edad: %s \nCiudad: %s", nombre,
                apellido, edad, ciudad);
       
        
        
    }
    
}
