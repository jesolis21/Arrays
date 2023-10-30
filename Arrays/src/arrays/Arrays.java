/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int[] primos = new int[10];
        int[] noPrimos = new int[10];
        int numPrimos = 0;
        int numNoPrimos = 0;

        System.out.println("Ingresa 10 números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            if (esPrimo(numeros[i])) {
                primos[numPrimos] = numeros[i];
                numPrimos++;
            } else {
                noPrimos[numNoPrimos] = numeros[i];
                numNoPrimos++;
            }
        }

        //  array original
        System.out.println("Array original:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }

        //  array con números primos al principio
        System.out.println("Array con números primos al principio:");
        for (int i = 0; i < numPrimos; i++) {
            System.out.println("Índice " + i + ": " + primos[i]);
        }
        for (int i = 0; i < numNoPrimos; i++) {
            System.out.println("Índice " + (i + numPrimos) + ": " + noPrimos[i]);
        }
    }

    // Función para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
