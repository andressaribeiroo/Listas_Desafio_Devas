package Lista_2;

import java.util.Scanner;

public class Questao2 {
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
        System.out.println("5. Resto");
        System.out.println("6. Raiz");
        System.out.println("7. Potência");

        int escolha = input.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Resultado da soma: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado da subtração: " + (num1 - num2));
                break;
            case 3:
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
                break;
            case 4:
                System.out.println("Resultado da multiplicação: " + (num1 * num2));
                break;
            case 5:
                System.out.println("Resultado do resto: " + (num1 % num2));
                break;
            case 6:
                System.out.println("Raiz quadrada do primeiro número: " + Math.sqrt(num1));
                break;
            case 7:
                System.out.println("Resultado da potência: " + Math.pow(num1, num2));
                break;
            default:
                System.out.println("Opção inválida.");
        }

        input.close();
    }
}
