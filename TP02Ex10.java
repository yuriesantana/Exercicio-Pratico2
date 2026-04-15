/*
TRABALHO PRÁTICO 02 - EXERCÍCIO 10

Enunciado:
Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
calcular e exibir a matriz inversa. Exibir as matrizes na tela, sob a forma matricial (linhas x
colunas).

Dupla:
- Yuri Mendes (CB3038122)
- Gabriel Batalha (CB3038076)
 */


import java.util.Locale;
import java.util.Scanner;

public class TP02Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int m;
        do {
            System.out.print("Digite a ordem da matriz (1 a 10): ");
            m = sc.nextInt();
        } while (m < 1 || m > 10);

        double[][] original = new double[m][m];
        double[][] matriz   = new double[m][m];
        double[][] inversa  = new double[m][m];

        System.out.println("\nDigite os elementos da matriz (" + m + "x" + m + "):");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < m; j++) {
                System.out.printf("Elemento [%d][%d]: ", i + 1, j + 1);
                original[i][j] = matriz[i][j] = sc.nextDouble();
            }

        for (int i = 0; i < m; i++)
            inversa[i][i] = 1.0;

        for (int col = 0; col < m; col++) {
            int pivoLinha = col;
            for (int i = col + 1; i < m; i++)
                if (Math.abs(matriz[i][col]) > Math.abs(matriz[pivoLinha][col]))
                    pivoLinha = i;

            double[] temp     = matriz[col];
            matriz[col]       = matriz[pivoLinha];
            matriz[pivoLinha] = temp;
            double[] tempI    = inversa[col];
            inversa[col]      = inversa[pivoLinha];
            inversa[pivoLinha] = tempI;

            if (Math.abs(matriz[col][col]) < 1e-10) {
                System.out.println("\nErro: a matriz é singular e não possui inversa!");
                sc.close();
                return;
            }

            double pivo = matriz[col][col];
            for (int j = 0; j < m; j++) {
                matriz[col][j]  /= pivo;
                inversa[col][j] /= pivo;
            }

            for (int i = 0; i < m; i++) {
                if (i == col) continue;
                double fator = matriz[i][col];
                for (int j = 0; j < m; j++) {
                    matriz[i][j]  -= fator * matriz[col][j];
                    inversa[i][j] -= fator * inversa[col][j];
                }
            }
        }

        System.out.println("\n=== Matriz Original (" + m + "x" + m + ") ===");
        exibirMatriz(original, m);
        System.out.println("\n=== Matriz Inversa (" + m + "x" + m + ") ===");
        exibirMatriz(inversa, m);

        sc.close();
    }

    static void exibirMatriz(double[][] mat, int ordem) {
        for (int i = 0; i < ordem; i++) {
            System.out.print("| ");
            for (int j = 0; j < ordem; j++)
                System.out.printf("%10.4f ", mat[i][j]);
            System.out.println("|");
        }
    }
}