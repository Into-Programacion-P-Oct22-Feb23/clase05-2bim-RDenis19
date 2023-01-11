/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete01;


public class Ejemplo03 {

    public static void main(String[] args) {
        int numero = 5;
        int valorFactorial = 1;
                
        for (int i = numero; i >= 1; i--) {
            System.out.printf("valorFactorial:%d  i:%d\n", valorFactorial, i);
            valorFactorial = valorFactorial * i;
            System.out.printf("------------------valorFactorial:%d\n", 
                    valorFactorial);
            
        }
        System.out.printf("%d\n", valorFactorial);
        
    }
    
}
