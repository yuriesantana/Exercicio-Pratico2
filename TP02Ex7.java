/*
TRABALHO PRÁTICO 02 - EXERCÍCIO 07

Enunciado:
Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
valor matriz e armazenar o resultado na própria matriz, nas posições correspondentes.

Dupla:
- Yuri Mendes (CB3038122)
- Gabriel Batalha (CB3038076)
 */

import java.util.Scanner;

public class TP02Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] matriz = new double[3][4];
        double constante;

        // Leitura dos valores da matriz
        System.out.println("Digite 12 valores para a matriz 3x4:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = sc.nextDouble();
            }
        }

        // Leitura da constante multiplicativa
        System.out.print("Digite a constante multiplicativa: ");
        constante = sc.nextDouble();

        // Multiplicação da matriz pela constante
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] *= constante;
            }
        }

        // Exibição da matriz resultante
        System.out.println("Matriz resultante após multiplicação:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}