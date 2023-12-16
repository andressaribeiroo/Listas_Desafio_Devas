package Lista_3;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nomeFuncionario = input.nextLine();

        System.out.print("Digite o número de horas trabalhadas por mês: ");
        int horasPorMes = input.nextInt();

        System.out.print("Digite o valor da hora de trabalho: ");
        double valorHora = input.nextDouble();

        double salarioAnual = calcularSalarioAnual(horasPorMes, valorHora);

        System.out.printf("O salário anual de %s é R$ %.2f%n", nomeFuncionario, salarioAnual);

        input.close();
    }

    public static double calcularSalarioAnual(int horasPorMes, double valorHora) {
        int mesesPorAno = 12;

        double salarioMensal = horasPorMes * valorHora;

        return salarioMensal * mesesPorAno;
    }
}
