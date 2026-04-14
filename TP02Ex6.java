/*
TRABALHO PRÁTICO 02 - EXERCÍCIO 06

Enunciado:
Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela.

Dupla:
- Yuri Mendes (CB3038122)
- Gabriel Batalha (CB3038076)
 */

import java.util.Scanner;

public class TP02Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] matriz = new String[2][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o nome para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextLine();
            }
        }

        System.out.println("Nomes armazenados na matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}