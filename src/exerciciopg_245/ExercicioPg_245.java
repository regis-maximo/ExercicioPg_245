/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciopg_245;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Regis_Maximo
 */
public class ExercicioPg_245 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int t[][] = new int[2][3];

        t[0][0] = 5;
        t[0][1] = 7;
        t[0][2] = 3;
        t[1][0] = 2;
        t[1][1] = 8;
        t[1][2] = 9;
        int l = 0; // variavel para contar linhas
        for (int c = 0; c <= 2; c++) { // for para mostrar o numero de índice de cada elemento da coluna
            System.out.printf("  [%d]", c);
        }
        System.out.println();// pula linha
     
        
        for (int i[] : t) {
            System.out.printf("[%d]",l++);// mostra o numero da linha
            for (int j : i) {
                System.out.printf("%2d  ", j);
            }
            System.out.println();
        }
        int maior = t[0][0];
        int menor = t[0][0];
        for (int i[] : t) {
            for (int j : i) {
                if (maior < j) {
                    maior = j;
                }
                if (menor > j) {
                    menor = j;
                }
            }
            System.out.println();
        }
        System.out.println("Maior elemento: " + maior);
        System.out.println("Menor elemento: " + menor);

        System.out.println("Elementos da primeira linha");
        for (int i = 0; i < t[0].length; i++) {
            System.out.printf(" %d", t[0][i]);
        }
        System.out.println();
        int total = 0;

        for (int i = 0; i < t.length; i++) {
            total += t[i][2];
        }

        System.out.println("Total na terceira coluna: " + total);
    }
}
