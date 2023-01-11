/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

public class Ejemplo01 {

    public static void main(String[] args) {
        imprimirNumeros(4);
    }

    public static void imprimirNumeros(int numero) {
        System.out.printf("El número es: %d\n", numero);
        numero = numero - 1;
        imprimirNumeros(numero);

    }

}
