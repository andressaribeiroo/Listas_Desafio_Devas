package Lista_3;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tempo gasto na viagem (em horas): ");
        double tempoViagem = input.nextDouble();

        System.out.print("Digite a velocidade média durante a viagem (em km/h): ");
        double velocidadeMedia = input.nextDouble();

        double consumoCombustivel = calcularCombustivel(tempoViagem, velocidadeMedia);

        System.out.printf("A quantidade de combustível gastos é de %.3f litros%n", consumoCombustivel);

        input.close();
    }

    public static double calcularCombustivel(double tempoViagem, double velocidadeMedia) {
        double kmPorLitro = 12.0;

        double distanciaPercorrida = tempoViagem * velocidadeMedia;

        return distanciaPercorrida / kmPorLitro;
    }
}
