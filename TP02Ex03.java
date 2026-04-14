/*
TRABALHO PRÁTICO 02 - EXERCÍCIO 03

Enunciado:
Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a quantidade de
números) será digitado, deverá ser positivo, porém menor que vinte. Caso a quantidade não
satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a
digitação dos “N” valores, exibir:

a. O maior valor;
b. O menor valor;
c. A soma dos valores;
d. A média aritmética dos valores;
e. A porcentagem de valores que são positivos;
f. A porcentagem de valores negativos;

Após exibir os dados, perguntar ao usuário de deseja ou não uma nova execução do
programa. Consistir a resposta no sentido de aceitar somente “S” ou “N” e encerrar o
programa em função dessa resposta.

Dupla:
- Yuri Mendes (CB3038122)
- Gabriel Batalha (CB3038076)
 */

import java.util.Scanner;

public class TP02Ex03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidade;
        String resposta;
        do {

            do {
                System.out.print("Digite a quantidade de valores (1 a 19): ");
                quantidade = scanner.nextInt();
                if (quantidade <= 0 || quantidade >= 20) {
                    System.out.println("Quantidade inválida. Por favor, digite um valor entre 1 e 19.");
                }
            } while (quantidade <= 0 || quantidade >= 20);

            int[] valores = new int[quantidade];
            int soma = 0;
            int maiorValor = Integer.MIN_VALUE;
            int menorValor = Integer.MAX_VALUE;
            int positivos = 0;
            int negativos = 0;

            for (int i = 0; i < valores.length; i++) {
                System.out.print("Digite o valor " + (i + 1) + ": ");
                valores[i] = scanner.nextInt();
                soma += valores[i];
                if (valores[i] > maiorValor) {
                    maiorValor = valores[i];
                }
                if (valores[i] < menorValor) {
                    menorValor = valores[i];
                }
                if (valores[i] > 0) {
                    positivos++;
                } else if (valores[i] < 0) {
                    negativos++;
                }
            }

            double media = (double) soma / valores.length;
            double porcentagemPositivos = (double) positivos / valores.length * 100;
            double porcentagemNegativos = (double) negativos / valores.length * 100;

            System.out.println("O maior valor é: " + maiorValor);
            System.out.println("O menor valor é: " + menorValor);
            System.out.println("A soma dos valores é: " + soma);
            System.out.println("A média aritmética dos valores é: " + media);
            System.out.println("Porcentagem de valores positivos: " + porcentagemPositivos + "%");
            System.out.println("Porcentagem de valores negativos: " + porcentagemNegativos + "%");

            do {
                System.out.print("Deseja realizar uma nova execução? (S/N): ");
                resposta = scanner.next().toUpperCase();

                if (!resposta.equals("S") && !resposta.equals("N")) {
                    System.out.println("Resposta inválida. Digite 'S' ou 'N'.");
                }

            } while (!resposta.equals("S") && !resposta.equals("N"));

        } while (resposta.equals("S"));

    }

}
