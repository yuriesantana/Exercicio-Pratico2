/*
TRABALHO PRÁTICO 02 - EXERCÍCIO 01

Enunciado:
Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro.
Caso contrário solicitar novamente apenas o segundo valor.

Dupla:
- Yuri Mendes (CB3038122)
- Gabriel Batalha (CB3038076)
 */

import java.util.Scanner;

public class TP02Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int primeiroValor = scanner.nextInt();

        int segundoValor;
        do {
            System.out.print("Digite o segundo valor (maior que o primeiro): ");
            segundoValor = scanner.nextInt();
            if (segundoValor <= primeiroValor) {
                System.out.println("O segundo valor deve ser maior que o primeiro. Tente novamente.");
            }
        } while (segundoValor <= primeiroValor);

        System.out.println("Valores aceitos: " + primeiroValor + " e " + segundoValor);
        scanner.close();
    }
}