package Lista_3;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a temperatura atual: ");
        double temperaturaAtual = input.nextDouble();

        System.out.print("Digite a medida atual (celsius, fahrenheit, kelvin): ");
        String medidaAtual = input.next().toLowerCase();

        System.out.print("Digite a medida final (celsius, fahrenheit, kelvin): ");
        String medidaFinal = input.next().toLowerCase();

        double resultado = converterTemperatura(temperaturaAtual, medidaAtual, medidaFinal);
        System.out.println(resultado);

        input.close();
    }

    public static double converterTemperatura(double temperatura, String medidaAtual, String medidaFinal) {
        switch (medidaAtual) {
            case "celsius":
                return converterDeCelsius(temperatura, medidaFinal);
            case "fahrenheit":
                return converterDeFahrenheit(temperatura, medidaFinal);
            case "kelvin":
                return converterDeKelvin(temperatura, medidaFinal);
            default:
                System.out.println("Erro: Medida atual inválida.");
                return Double.NaN;
        }
    }

    public static double converterDeCelsius(double temperatura, String medidaFinal) {
        switch (medidaFinal) {
            case "celsius":
                return temperatura;
            case "fahrenheit":
                return (temperatura * 9 / 5) + 32;
            case "kelvin":
                return temperatura + 273.15;
            default:
                System.out.println("Erro: Medida final inválida.");
                return Double.NaN;
        }
    }

    public static double converterDeFahrenheit(double temperatura, String medidaFinal) {
        switch (medidaFinal) {
            case "celsius":
                return (temperatura - 32) * 5 / 9;
            case "fahrenheit":
                return temperatura;
            case "kelvin":
                return (temperatura + 459.67) * 5 / 9;
            default:
                System.out.println("Erro: Medida final inválida.");
                return Double.NaN;
        }
    }

    public static double converterDeKelvin(double temperatura, String medidaFinal) {
        switch (medidaFinal) {
            case "celsius":
                return temperatura - 273.15;
            case "fahrenheit":
                return (temperatura * 9 / 5) - 459.67;
            case "kelvin":
                return temperatura;
            default:
                System.out.println("Erro: Medida final inválida.");
                return Double.NaN;
        }
    }
}
