/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete01;

public class Ejemplo08 {

    public static void main(String[] args) {
        int[] datos = {100, 200, 1000};
        System.out.printf("%d\n", misterio(datos, datos.length));
    }

    public static int misterio(int[] arreglo, int tamanio) {

        if (tamanio == 1) {
            return arreglo[0];
        } else {
            return arreglo[tamanio - 1] + misterio(arreglo, tamanio - 1);
        }
    }

}
