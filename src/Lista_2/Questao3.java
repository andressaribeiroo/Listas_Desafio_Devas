package Lista_2;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de notas: ");
        int qtdNotas = input.nextInt();

        if (qtdNotas <= 0) {
            System.out.println("A quantidade de notas deve ser maior que zero.");
            return;
        }

        double somaNotas = 0;

        for (int i = 1; i <= qtdNotas; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = input.nextDouble();
            somaNotas += nota;
        }

        double media = somaNotas / qtdNotas;
        System.out.println("A média das notas é: " + media);

        input.close();
    }

}
