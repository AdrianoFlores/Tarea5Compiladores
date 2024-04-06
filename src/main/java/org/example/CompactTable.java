package org.example;

public class CompactTable {
    public static void main(String[] args) {
        // Definir la tabla compactada
        int[][] compactTable = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        // Acceder e imprimir los valores de la tabla compactada
        for (int i = 0; i < compactTable.length; i++) {
            for (int j = 0; j < compactTable[i].length; j++) {
                System.out.print(compactTable[i][j] + " ");
            }
            System.out.println();
        }
    }
}
