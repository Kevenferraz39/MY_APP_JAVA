package Curso_em_video.operacoes_matematica;

import java.util.Scanner;

public class Exponenciacao {
    public static void main(String[] args) {
        System.out.print("Exponenciação\n\n");
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a base: ");
        double base = entrada.nextDouble();

        System.out.print("Digite o expoente: ");
        double expoente = entrada.nextDouble();

        double resultado = Math.pow(base, expoente);

        System.out.println(base + " elevado a " + expoente + " é: " + resultado);

        entrada.close();
    }
}

