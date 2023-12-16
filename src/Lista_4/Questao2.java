package Lista_4;

public class Questao2 {
    public static void main(String[] args) {
        int[][] turma = {
                {9, 8, 7, 8},
                {10, 9, 8, 9},
                {9, 8, 7, 8}
        };

        calcularMedias(turma);
    }

    public static void calcularMedias(int[][] turma) {
        for (int i = 0; i < turma.length; i++) {
            int somaNotasAluno = 0;

            for (int nota : turma[i]) {
                somaNotasAluno += nota;
            }

            double mediaAluno = (double) somaNotasAluno / turma[i].length;

            System.out.printf("Aluno %d - Média %.2f%n", i, mediaAluno);
        }

        double somaMediasTurma = 0;

        for (int i = 0; i < turma.length; i++) {
            int somaNotasAluno = 0;

            for (int nota : turma[i]) {
                somaNotasAluno += nota;
            }

            double mediaAluno = (double) somaNotasAluno / turma[i].length;
            somaMediasTurma += mediaAluno;
        }

        double mediaTurma = somaMediasTurma / turma.length;
        System.out.printf("Média da turma: %.2f%n", mediaTurma);
    }
}

