package Atividades;

public class Atividade2 {

    public static void main(String[] args) {
        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        int soma = 0;

        System.out.println("Elementos nos índices ímpares:");
        for (int i = 0; i < vetor.length - 1; i++) {
            System.out.print(vetor[i + 1] + " ");
        }

        System.out.println("\nElementos pares do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");
            }
        }

        double media = (double) soma / vetor.length;
        System.out.println("\nSoma: " + soma);
        System.out.println("Média: " + media);
    }

}
