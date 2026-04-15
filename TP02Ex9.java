/*
TRABALHO PRÁTICO 02 - EXERCÍCIO 09

Enunciado:
Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário,
sendo que no máximo 10x10. A matriz não precisa ser quadrática. Após a digitação dos
elementos, calcular e exibir a matriz transposta.

Dupla:
- Yuri Mendes (CB3038122)
- Gabriel Batalha (CB3038076)
 */

import java.util.Scanner;

public class TP02Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura das dimensões
        int m, n;
        do {
            System.out.print("Digite o número de linhas (1 a 10): ");
            m = sc.nextInt();
        } while (m < 1 || m > 10);

        do {
            System.out.print("Digite o número de colunas (1 a 10): ");
            n = sc.nextInt();
        } while (n < 1 || n > 10);

        double[][] original = new double[m][n];
        double[][] transposta = new double[n][m]; // dimensões invertidas

        // Entrada dos elementos
        System.out.println("\nDigite os elementos da matriz (" + m + "x" + n + "):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Elemento [%d][%d]: ", i + 1, j + 1);
                original[i][j] = sc.nextDouble();
            }
        }

        // Cálculo da transposta: linha vira coluna, coluna vira linha
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                transposta[j][i] = original[i][j];

        // Exibição
        System.out.println("\n=== Matriz Original (" + m + "x" + n + ") ===");
        exibirMatriz(original, m, n);

        System.out.println("\n=== Matriz Transposta (" + n + "x" + m + ") ===");
        exibirMatriz(transposta, n, m);

        sc.close();
    }

    static void exibirMatriz(double[][] mat, int linhas, int colunas) {
        for (int i = 0; i < linhas; i++) {
            System.out.print("| ");
            for (int j = 0; j < colunas; j++)
                System.out.printf("%7.2f ", mat[i][j]);
            System.out.println("|");
        }
    }
}