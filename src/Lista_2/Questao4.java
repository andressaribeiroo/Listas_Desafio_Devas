package Lista_2;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro X: ");
        int x = input.nextInt();

        System.out.println("Os primeiros 10 múltiplos de " + x + " são:");

        for (int i = 1; i <= 10; i++) {
            int resultado = x * i;
            System.out.println(x + " x " + i + " = " + resultado);
        }

        input.close();
    }
}