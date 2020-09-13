/*
 Hacer un programa que imprima el área de un cuadrado, un rectángulo, un círculo y un triángulo
 */
package pkg09.pkg09ejercicio;

import java.util.Scanner;
public class Main 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        double atria, btria, htria, acuad, lcuad, acirc, radio, arect, brect, hrect;
        int opt;
        Scanner thule = new Scanner(System.in);
        ClsAreas areasf = new ClsAreas();
        
        
        
        
        do
        {
            
            System.out.println("Calcular el área de algunas figuras(1. círculo; 2. Cuadrado; 3. Rectángulo; 4. Triángulo)");
            System.out.println("Elige una opción: ");
            opt = thule.nextInt();
        }    
        while (opt > 4);
        
        switch (opt)
        {
            case 1:
                System.out.println("Ingresa el radio del círculo: ");
                radio = thule.nextDouble();
                
                acirc = areasf.areaCirculo(radio);
                System.out.println("El área del círculo es " + acirc);
            break;
                
            case 2:
                System.out.println("Ingresa el lado del cuadrado: ");
                lcuad = thule.nextDouble();
                
                acuad = areasf.areaCuadrado(lcuad);
                System.out.println("El área del cuadrado es: " + acuad);
            break;
            
            case 3:
                System.out.println("Ingresa la base del Réctangulo: ");
                brect = thule.nextDouble();
                System.out.println("Ingresa la altura del Réctangulo: ");
                hrect = thule.nextDouble();
                
                arect = areasf.areaRectangulo(brect, hrect);
                System.out.println("El área del rectángulo es: " + arect);
            break;
            
            case 4:
                System.out.println("Ingresa la base del triángulo: ");
                btria = thule.nextDouble();
                System.out.println("Ingresa la altura del triángulo: ");
                htria = thule.nextDouble();
                
                atria = areasf.areaTriangulo(btria, htria);
                System.out.println("El área del triángulo es: " + atria);
            break;
            
            default:
                System.out.println("Por favor ingresa una opción válida");
        }

    }
    
}
