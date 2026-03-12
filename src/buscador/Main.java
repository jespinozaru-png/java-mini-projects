/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buscador;

import java.util.Scanner;

/**
 *
 * @author JEFERSON
 */
public class Main {

    public static void main(String[] args) {
        String[] diccionario = {
            "algoritmo", "array", "binario", "búsqueda", "clase",
            "compilador", "estructura", "función", "herencia",
            "interfaz", "java", "lista", "método", "objeto",
            "paquete", "polimorfismo", "recursión", "variable"
        };

        BuscadorPalabras buscador = new BuscadorPalabras(diccionario);
        Scanner sc = new Scanner(System.in);

        System.out.println("=== BUSCADOR DE PALABRAS ===");
        System.out.println("Palabras disponibles: " + diccionario.length);

        while (true) {
            System.out.println("\nIngresa una palabra a buscar (o 'salir'): ");
            String input = sc.nextLine().trim();

            if (input.equalsIgnoreCase("salir")) {
                break;
            }

            ResultadoBusqueda lineal = buscador.busquedaLienal(input);
            ResultadoBusqueda binaria = buscador.busquedaBinaria(input);

            System.out.println(lineal);
            System.out.println(binaria);

            if (!lineal.isEncontrado()) {
                System.out.println("La palabra no esta en el diccionario");
            }

        }

        sc.close();
        System.out.println("Hasta luego.");

    }
}
