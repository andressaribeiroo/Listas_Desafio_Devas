package Lista_2;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int x = input.nextInt();

        if (x % 2 != 0) {
            System.out.println("Weird");
        } else {
            if (x >= 2 && x <= 5) {
                System.out.println("Not Weird");
            } else if (x >= 6 && x <= 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }

        input.close();
            
        }
    }


