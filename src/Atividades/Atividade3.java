package Atividades;

public class Atividade3 {

    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int somaP = 0, somaS = 0;

        System.out.println("Elementos da Diagonal Principal:");
        for (int i = 0; i < matriz.length; i++) {
            somaP += matriz[i][i];
            System.out.print(matriz[i][i] + " ");
        }

        System.out.println("\nElementos da Diagonal Secundária:");
        for (int i = 0; i < matriz.length; i++) {
            somaS += matriz[i][2 - i];
            System.out.print(matriz[i][2 - i] + " ");
        }

        System.out.println("\nSoma dos Elementos da Diagonal Principal:\n" + somaP);
        System.out.println("Soma dos Elementos da Diagonal Secundária:\n" + somaS);
    }

}
