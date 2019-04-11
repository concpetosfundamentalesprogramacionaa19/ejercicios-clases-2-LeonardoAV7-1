/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclase;

import java.util.Scanner;

/**
 *
 * @author Junior Aguilar
 */
public class MiEjercicio {
    
    public static void main(String[] args) {
        // TODO code application logic here
        // No olvidar ingresar valores
        
        String nombre;
        int edad;
        String ciudad;
        String pais;
        double nota1;
        double nota2;
        double promedio;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor ingresar sus nombres y apellidos");
        nombre = entrada.nextLine();
        
        System.out.println("Por favor ingresar su edad");
        edad = entrada.nextInt();
        entrada.nextLine(); // limpieza del buffer de entrada de datos
        
        System.out.println("Por favor ingresar su ciudad");
        ciudad = entrada.nextLine();
        
        System.out.println("Por favor ingresar su país");
        pais = entrada.nextLine();
        
        System.out.println("Por favor ingresar su primera nota");
        nota1 = entrada.nextInt();
        
        System.out.println("Por favor ingresar su segunda nota");
        nota2 = entrada.nextInt();
        
        promedio = (nota1+nota2)/2;
        
        System.out.printf("Sus nombres y apellidos: %s \nEdad: %s \nCiudad: %s \nPaís: %s \nNotas: %s, %s \nPromedio; %s", nombre,
                 edad, ciudad, pais, nota1, nota2, promedio);
       
        
        
    }
    
}
