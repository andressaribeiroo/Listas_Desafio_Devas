package Lista_4;

import java.util.Arrays;
public class Questao1 {
    public static void main(String[] args) {
        int[] A1 = {1, 2, 3, 4};
        int[] B1 = {5, 6, 7, 8};
        int[] resultado = concatenar(A1, B1);
        System.out.println("Output: " + Arrays.toString(resultado));
    }
    public static int[] concatenar(int[] A, int[] B) {
        int tamanho = A.length * 2;
        int[] resultado = new int[tamanho];

        for (int i = 0, n = 0; i < A.length; i++) {
            resultado[n++] = A[i];
            resultado[n++] = B[i];
        }
        return resultado;
    }
}

