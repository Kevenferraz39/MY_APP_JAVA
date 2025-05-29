package Curso_em_video.Aula6.operacoes_matematica;

import java.util.Scanner;

public class RestoDivisao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = entrada.nextInt();

        if (numero2 != 0) {
            int resto = numero1 % numero2;
            System.out.println("O resto da divisão de " + numero1 + " por " + numero2 + " é: " + resto);
        } else {
            System.out.println("Erro: Divisão por zero não é permitida.");
        }

        entrada.close();
    }
}

