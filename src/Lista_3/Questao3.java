package Lista_3;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();

        long resultado = calcularFatorial(numero);

        System.out.println("O fatorial de " + numero + " é: " + resultado);

        input.close();
    }

    public static long calcularFatorial(int n) {
        if (n < 0) {
            System.out.println("Não é possível calcular o fatorial de um número negativo.");
            return -1;
        }

        long fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        return fatorial;
    }
}
