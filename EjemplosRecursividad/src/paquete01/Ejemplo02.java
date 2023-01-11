/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

public class Ejemplo02 {

    public static void main(String[] args) {
        int numero = 20;
        System.out.printf("Números del %d al 1\n", numero);
        imprimirNumeros(numero);
    }

    public static void imprimirNumeros(int numero) {
        
        System.out.printf("El número es: %d\n", numero);
        if (numero > 1) {  // se busca una condición que se 
                           // acerque al caso base
            numero = numero - 1;
            imprimirNumeros(numero);
        }
    }

}
