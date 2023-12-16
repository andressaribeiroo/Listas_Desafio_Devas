package Lista_4;

import java.util.Arrays;
public class Questao3 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] resultado = somaAcumulada(nums);
        System.out.println("Output: " + Arrays.toString(resultado));
    }
    public static int[] somaAcumulada(int[] nums) {
        int n = nums.length;
        int[] resultado = new int[n];

        if (n > 0) {
            resultado[0] = nums[0];

            for (int i = 1; i < n; i++) {
                resultado[i] = resultado[i - 1] + nums[i];
            }
        }
        return resultado;
    }
}
