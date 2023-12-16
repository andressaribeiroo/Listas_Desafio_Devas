package Lista_3;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = input.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1. Somar");
        System.out.println("2. Subtrair");
        System.out.println("3. Dividir");
        System.out.println("4. Multiplicar");

        int escolha = input.nextInt();

        double resultado;

        switch (escolha) {
            case 1:
                resultado = somar(num1, num2);
                break;
            case 2:
                resultado = subtrair(num1, num2);
                break;
            case 3:
                if (num2 != 0) {
                    resultado = dividir(num1, num2);
                } else {
                    System.out.println("Erro: Não é possível dividir por zero.");
                    return;
                }
                break;
            case 4:
                resultado = multiplicar(num1, num2);
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        System.out.println("Resultado: " + resultado);

        input.close();
    }
    public static double somar(double a, double b) {
        return a + b;
    }
    public static double subtrair(double a, double b) {
        return a - b;
    }
    public static double dividir(double a, double b) {
        return a / b;
    }
    public static double multiplicar(double a, double b) {
        return a * b;
    }
}
