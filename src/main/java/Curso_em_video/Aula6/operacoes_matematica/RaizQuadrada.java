package Curso_em_video.Aula6.operacoes_matematica;

import java.util.Scanner;

public class RaizQuadrada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número para calcular a raiz quadrada: ");
        double numero = entrada.nextDouble();

        if (numero >= 0) {
            double resultado = Math.sqrt(numero);
            System.out.println("A raiz quadrada de " + numero + " é: " + resultado);
        } else {
            System.out.println("Erro: não é possível calcular raiz quadrada de número negativo (números reais).");
        }

        entrada.close();
    }
}

