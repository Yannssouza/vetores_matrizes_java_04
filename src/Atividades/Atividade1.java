package Atividades;

import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        int index = 0;
        boolean posicao = false;

        System.out.println("Digite o numero que você deseja encontrar:");
        int numero = leia.nextInt();

        leia.close();

        while (index < vetor.length) {
            if (vetor[index] == numero) {
                posicao = true;
                break;
            }
            index++;
        }

        if (posicao) {
            System.out.println("O número " + numero + " está localizado na posição:\n" + index);
        } else {
            System.out.println("O numero " + numero + " não foi encontrado!");
        }
    }

}
