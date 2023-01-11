/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete02;

import java.util.Locale;
import java.util.Scanner;

public class Ejemplo08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese el limite del arreglo");
        int tamaño = entrada.nextInt();
        entrada.nextLine();
        int [] arreglo = new int [tamaño];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.printf("Ingrese el valor para la posicion %d\n", i);
            int dato = entrada.nextInt();
            arreglo[i]=dato;
        }
        int resultado;
        resultado = misterio(arreglo, tamaño);
        System.out.printf("El resultado es %s\n",resultado);
        
        // Ingresar por teclado el tamaño de un arreglo
        // Ingresar por teclado los valores enteros del arreglo
        // Sumar los valores del arreglo, mediante la función misterio
        
    }

    public static int misterio(int[] arreglo, int tamanio) {

        if (tamanio == 1) {
            return arreglo[0];
        } else {
            return arreglo[tamanio - 1] + misterio(arreglo, tamanio - 1);
        }
    }

}
