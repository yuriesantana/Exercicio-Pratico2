/*
TRABALHO PRÁTICO 02 - EXERCÍCIO 02

Enunciado:
Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de
erro, se necessário. Após a digitação, exibir:
a. O maior valor;
b. A soma dos valores;
c. A média aritmética dos valores.

Dupla:
- Yuri Mendes (CB3038122)
- Gabriel Batalha (CB3038076)
 */

import java.util.Scanner;

public class TP02Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[10];
        int soma = 0;
        int maiorValor = Integer.MIN_VALUE;

        for (int i = 0; i < valores.length; i++) {
            int valor;
            do {
                System.out.print("Digite um valor positivo: ");
                valor = scanner.nextInt();
                if (valor <= 0) {
                    System.out.println("Valor inválido. Por favor, digite um valor positivo.");
                }
            } while (valor <= 0);

            valores[i] = valor;
            soma += valor;
            if (valor > maiorValor) {
                maiorValor = valor;
            }
        }

        double media = (double) soma / valores.length;

        System.out.println("O maior valor é: " + maiorValor);
        System.out.println("A soma dos valores é: " + soma);
        System.out.println("A média aritmética dos valores é: " + media);

        scanner.close();
    }
}