package Lista_4;

public class Questao5 {
    public static void main(String[] args) {
        int[] nums1 = {1, 7, 3, 6, 5, 6};
        int resultado1 = indicePivo(nums1);
        System.out.println("Output: " + resultado1);

        int[] nums2 = {1, 2, 3};
        int resultado2 = indicePivo(nums2);
        System.out.println("Output: " + resultado2);

        int[] nums3 = {-1, -1, -1, 0, 1, 1};
        int resultado3 = indicePivo(nums3);
        System.out.println("Output " + resultado3);
    }

    public static int indicePivo(int[] nums) {
        int somaTotal = 0;
        int somaEsquerda = 0;

        for (int num : nums) {
            somaTotal += num;
        }

        for (int i = 0; i < nums.length; i++) {
            if (somaEsquerda == somaTotal - somaEsquerda - nums[i]) {
                return i;
            }
            somaEsquerda += nums[i];
        }

        return -1;
    }
}

//Fontes com a explicação que me ajudaram nessa resolução;
//https://dev.to/kaflenitish/solving-find-pivot-index-from-leetcode-explanation-m6o
//https://www.youtube.com/watch?v=Sw4nUFc-tfA
//https://www.youtube.com/watch?v=VlI3Rg9NnMk