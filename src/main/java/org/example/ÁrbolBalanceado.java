package org.example;

import java.util.TreeMap;

public class ÁrbolBalanceado {
    public static void main(String[] args) {
        // Crear un TreeMap con clave de tipo Integer y valor de tipo String
        TreeMap<Integer, String> arbol = new TreeMap<>();

        // Agregar elementos al TreeMap
        arbol.put(3, "Tres");
        arbol.put(1, "Uno");
        arbol.put(2, "Dos");

        // Imprimir el TreeMap (ordenado por clave)
        System.out.println("TreeMap: " + arbol);

        // Acceder a un valor a través de su clave
        System.out.println("Valor asociado a la clave 2: " + arbol.get(2));

        // Verificar si una clave existe en el TreeMap
        System.out.println("¿Contiene la clave 4? " + arbol.containsKey(4));

        // Eliminar un elemento del TreeMap
        arbol.remove(1);

        // Imprimir el TreeMap después de eliminar un elemento
        System.out.println("TreeMap después de eliminar la clave 1: " + arbol);

        // Iterar sobre las entradas del TreeMap
        for (Integer clave : arbol.keySet()) {
            System.out.println("Clave: " + clave + ", Valor: " + arbol.get(clave));
        }
    }
}
