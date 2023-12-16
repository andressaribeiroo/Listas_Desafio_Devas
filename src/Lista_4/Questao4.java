package Lista_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Map<String, Integer> votosCandidatos = new HashMap<>();
        votosCandidatos.put("Joao", 0);
        votosCandidatos.put("Hugo", 0);
        votosCandidatos.put("Pedro", 0);
        votosCandidatos.put("Nulo", 0);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome do candidato ou 'Nulo': ");
            String voto = input.nextLine();

            //Observações para estudo:
            //Caso o eleitor vote em um nome que não existe, deverá ser contabilizado um voto nulo.
            //A função containsKey() é um método da interface Map em Java, e ela verifica se contém uma chave específica.

            if (votosCandidatos.containsKey(voto)) {
                votosCandidatos.merge(voto, 1, Integer::sum);
            } else {
                System.out.println("Nome de candidato inválido. Voto nulo contabilizado.");
                votosCandidatos.merge("Nulo", 1, Integer::sum);
            }
        }

        input.close();

        exibirResultados(votosCandidatos);
    }

    private static void exibirResultados(Map<String, Integer> votosCandidatos) {

        //values(): retorna uma coleção (Collection) de todos os valores  que representam a quantidade de votos para cada candidato.
        //stream(): converte a coleção de valores em um fluxo
        //mapToInt(Integer::intValue): mapeia cada elemento do fluxo para um tipo primitivo int para usar a operação sum() posteriormente.

        int totalVotos = votosCandidatos.values().stream().mapToInt(Integer::intValue).sum();

        System.out.println("Resultados da votação:");

        votosCandidatos.forEach((candidato, votos) -> {
            double percentual = (votos / (double) totalVotos) * 100;
            System.out.printf("%s: %d votos (%.2f%%)%n", candidato, votos, percentual);
        });

    }
}


////Fontes com a explicação que me ajudaram nessa resolução;
//https://www.youtube.com/watch?v=c64a76Fen5U
//https://www.devmedia.com.br/conhecendo-a-interface-map-do-java/37463
//https://www.devmedia.com.br/utilizando-map-para-armazenar-arrays/22493
//https://www.devmedia.com.br/hashmap-java-trabalhando-com-listas-key-value/29811
//https://www.youtube.com/watch?v=a7OtJN3sV4o
//https://www.youtube.com/watch?v=H62Jfv1DJlU