/*
TRABALHO PRÁTICO 02 - EXERCÍCIO 08

Enunciado:
Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
valor matriz e armazenar o resultado em outra matriz de mesma ordem, nas posições
correspondentes. Exibir as matrizes na tela, sob a forma matricial, ou seja, linhas por
colunas.

Dupla:
- Yuri Mendes (CB3038122)
- Gabriel Batalha (CB3038076)
 */

import java.util.Locale;
import java.util.Scanner;

public class TP02Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US); // aceita ponto decimal
        double[][] original  = new double[3][4];
        double[][] resultado = new double[3][4];

        // Entrada dos 12 valores
        System.out.println("Digite os 12 valores da matriz (3x4):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("Elemento [%d][%d]: ", i + 1, j + 1);
                original[i][j] = sc.nextDouble();
            }
        }

        // Constante multiplicativa
        System.out.print("\nDigite a constante multiplicativa: ");
        double constante = sc.nextDouble();

        // Multiplicação
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 4; j++)
                resultado[i][j] = original[i][j] * constante;

        // Exibição das matrizes
        System.out.println("\n=== Matriz Original ===");
        exibirMatriz(original);

        System.out.printf("%n=== Matriz Resultado (x %.2f) ===%n", constante);
        exibirMatriz(resultado);

        sc.close();
    }

    static void exibirMatriz(double[][] m) {
        for (double[] linha : m) {
            System.out.print("| ");
            for (double val : linha)
                System.out.printf("%8.2f ", val);
            System.out.println("|");
        }
    }
}