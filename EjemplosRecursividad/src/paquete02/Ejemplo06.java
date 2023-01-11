/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete02;

public class Ejemplo06 {

    public static void main(String[] args) {

        int[] valor1 = {100, 1000, 200, 2000, 3000};
        int[] valor2 = {1, 2, 3, 4, 5};
        
        for (int i = 0; i < valor1.length; i++) {
            System.out.printf("El valor es: %d\n", obtenerSuma(valor1[i], 
                    valor2[i]));
            
            
        }
        
        // Encontrar la suma de las posiciones
        // [0][0]
        // [1][1]
        // hasta el final

    }

    public static int obtenerSuma(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            if (a == 0) {
                return b;
            } else {
                return 1 + obtenerSuma(a, b - 1);
            }
        }
    }

}
