/*package Logica;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String opcion;
        int fila;
        int columna;
        boolean bandera = false;
        Scanner sc = new Scanner(System.in);
        char asientos[][] = new char[10][10];
        teatroVacio(asientos);
        imprimirMatriz(asientos);
        comprarEntrada(asientos, sc);
        imprimirMatriz(asientos);
    }

    public static char[][] teatroVacio(char[][] asientos) {
        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 10; c++) {
                asientos[f][c] = 'O';
            }
        }
        return asientos;
    }

    public static void imprimirMatriz(char[][] asientos) {
        for (int f = 0; f < 10; f++) {
            System.out.print((f + 1) < 10 ? " " + (f + 1) : (f + 1));
            for (int c = 0; c < 10; c++) {
                System.out.print("[" + asientos[f][c] + "]");
            }
            System.out.println();
        }
    }

    public static char[][] comprarEntrada(char[][] asientos, Scanner sc) {
        String opcion;
        int fila;
        int columna;
        boolean bandera = false;
        while (bandera == false) {
            System.out.println("Introduce la fila");
            fila = sc.nextInt();
            sc.nextLine();
            System.out.println("Introduce la columna");
            columna = sc.nextInt();
            sc.nextLine();
            if (asientos[fila - 1][columna - 1] == 'O') {
                asientos[fila - 1][columna - 1] = 'x';
            } else {
                System.out.println("Asiento ocupado, elija otro");
            }
            System.out.println("Quieres comprar otra entrada? [S/N]");
            opcion = sc.nextLine();
            if (!opcion.equalsIgnoreCase("S")) {
                bandera = true;
            }
        }
        return asientos;
    }
}*/
