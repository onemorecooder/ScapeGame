/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UF1NF2_2_exercices;

import java.util.Scanner;

/**
 *
 * @author ajose
 */
public class ex_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        char[][] tabla = new char[10][10];
        char player = 'P', meta = 'S', icon = '·';
        String eleccion;
        Scanner sc = new Scanner(System.in);
        int filaRand, colRand, filaInicial = 0, colInicial = 0;
        int filaActual = 0, colActual = 0;
        filaRand = (int) (Math.random() * 10);
        colRand = (int) (Math.random() * 10);

        for (int filas = 0; filas < tabla.length; filas++) {
            for (int columnas = 0; columnas < tabla.length; columnas++) {
                tabla[filas][columnas] = icon;
                tabla[filaInicial][colInicial] = player;
            }
        }

        tabla[filaRand][colRand] = meta;

        for (char x[] : tabla) {
            for (char y : x) {
                System.out.print(y + "  ");
            }
            System.out.println("");
        }

        while (filaActual != filaRand || colActual != colRand) {
            System.out.println("**** ELIGE TU MOVIMIENTO ****");
            eleccion = sc.next();

            switch (eleccion) {
                case "s":
                    if (filaActual == tabla.length - 1) {
                        System.out.println("*** ¡NO PUEDEES PASAAAAR! ***");
                        break;
                    } else {
                        filaActual += 1;
                        tabla[filaActual][colActual] = player;
                        tabla[filaActual - 1][colActual] = icon;
                    }
                    break;
                case "w":
                    if (filaActual == 0) {
                        System.out.println("*** ¡NO PUEDEES PASAAAAR! ***");
                        break;
                    } else {
                        filaActual -= 1;
                        tabla[filaActual][colActual] = player;
                        tabla[filaActual + 1][colActual] = icon;
                    }
                    break;
                case "d":
                    if (colActual == tabla.length - 1) {
                        System.out.println("*** ¡NO PUEDEES PASAAAAR! ***");
                        break;
                    } else {
                        colActual += 1;
                        tabla[filaActual][colActual] = player;
                        tabla[filaActual][colActual - 1] = icon;
                    }
                    break;
                case "a":
                    if (colActual == 0) {
                        System.out.println("*** ¡NO PUEDEES PASAAAAR! ***");
                        break;
                    } else {
                        colActual -= 1;
                        tabla[filaActual][colActual] = player;
                        tabla[filaActual][colActual + 1] = icon;
                    }
                    break;
                default:
                    System.out.println("\n*** ¡Elige una posición válida! ***\n");
            }
            if (filaActual != filaRand || colActual != colRand) {
                for (char x[] : tabla) {
                    for (char y : x) {
                        System.out.print(y + "  ");
                    }
                    System.out.println("");
                }
            }

        }

        System.out.println("\n**** ¡¡¡HAS ESCAPADO!!! ****\n");

        for (char x[] : tabla) {
            for (char y : x) {
                System.out.print(y + "  ");
            }
            System.out.println("");
        }

    }

}
