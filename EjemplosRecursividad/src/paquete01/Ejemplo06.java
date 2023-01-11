/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

public class Ejemplo06 {

    public static void main(String[] args) {
        String [] arreglo = obtenerArreglo();
        System.out.println("------------------------------------");
        System.out.println("\nEl arreglo:");
        for(int i = 0; i < arreglo.length; i++){
            System.out.printf("[%s] ", arreglo[i]);
        }
        System.out.println("\nDebe tener valores de 4 o 5:");
        obtenerValores(arreglo);
    }
    
    public static String [] obtenerArreglo(){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese el numero de elementos que contendra "
                + "el arreglo:");
        int elementos = entrada.nextInt();
        entrada.nextLine();
        String [] cadena = new String [elementos];
        for (int i = 0; i < cadena.length; i++) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Ingrese Ciudades del Ecuador: ");
            String ciudad = entrada.nextLine();
            cadena[i] = ciudad;
        }
        String mensaje = "";
        for (int i = 0; i < cadena.length; i++) {
            mensaje = String.format("%s%s",mensaje, cadena[i]);
        }
        return cadena;
    }
    
    public static void obtenerValores(String [] arreglo){
        int datos;
        for(int i = 0; i < arreglo.length; i++){
            datos = arreglo[i].length();
            if(datos == 4 || datos == 5){
                System.out.printf("%s\n", arreglo[i]);
            }
        }
    }
}  
//INTEGRANTES
//Denis Ruiz
//Steveen Cuenca