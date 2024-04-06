package org.example;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        // Crear un ArrayList de enteros
        ArrayList<Integer> numeros = new ArrayList<>();

        // Agregar elementos al ArrayList
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        // Acceder e imprimir elementos del ArrayList
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("Elemento en la posición " + i + ": " + numeros.get(i));
        }

        // Eliminar un elemento del ArrayList
        numeros.remove(1);

        // Imprimir el ArrayList después de eliminar un elemento
        System.out.println("Después de eliminar el elemento en la posición 1:");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("Elemento en la posición " + i + ": " + numeros.get(i));
        }
    }
}
