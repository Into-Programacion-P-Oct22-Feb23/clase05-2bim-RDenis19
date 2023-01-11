/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete01;

public class Ejemplo05 {

    public static void main(String[] args) {
        
        System.out.printf("%.2f\n", factorial(5));
    }

    public static double factorial(double numero) {
        if (numero <= 1) { // aquí se evalua el caso base
            System.out.println("1");
            return 1; // 0! = 1 
                      // 1! = 1
        } else { 
            // paso recursivo
            // numero = numero - 1
            System.out.printf("numero:%.1f * factorial(%.1f)\n", 
                    numero, numero-1);
            return numero * factorial(numero - 1);
        }
    }

}
