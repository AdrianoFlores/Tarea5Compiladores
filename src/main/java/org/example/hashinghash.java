package org.example;

import java.util.HashMap;
import java.util.Map;

public class hashinghash {
    public static void main(String[] args) {
        // Crear un HashMap con clave de tipo String y valor de tipo Integer
        HashMap<String, Integer> mapa = new HashMap<>();

        // Agregar elementos al HashMap
        mapa.put("Uno", 1);
        mapa.put("Dos", 2);
        mapa.put("Tres", 3);

        // Imprimir el HashMap
        System.out.println("HashMap: " + mapa);

        // Acceder a un valor a través de su clave
        System.out.println("Valor asociado a 'Dos': " + mapa.get("Dos"));

        // Verificar si una clave existe en el HashMap
        System.out.println("¿Contiene la clave 'Cuatro'? " + mapa.containsKey("Cuatro"));

        // Eliminar un elemento del HashMap
        mapa.remove("Dos");

        // Imprimir el HashMap después de eliminar un elemento
        System.out.println("HashMap después de eliminar 'Dos': " + mapa);

        // Iterar sobre las entradas del HashMap
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }
    }
}
