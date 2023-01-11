/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete01;

public class Ejemplo04 {

    public static void main(String[] args) {
        
        System.out.printf("%.2f\n", factorial(5));
                                     // 120
    }

    public static double factorial(double numero) { // 5 
                                                    // 4
                                                    // 3
                                                    // 2
                                                    // 1
        
            // 5<=1 f
            // 4<=1 f
            // 3<=1 f
            // 2<=1 f
            // 1<=1 v
        if (numero <= 1) { // aquí se evalua el caso base
            
            return 1; // 0! = 1 
                      // 1! = 1
        } else { 
            // paso recursivo
            // numero = numero - 1 
            return numero * factorial(numero - 1);
                 //  5 * factorial(4)
                 //  5 * 24 = 120
                 
                 //  4 * factorial(3)
                 //  4 * 6 = 24
                 
                 //  3 * factorial(2)
                 //  3 * 2 = 6
                 
                 //  2 * factorial(1)
                 //  2 * 1 = 2
        }
    }

}
