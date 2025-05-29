package Curso_em_video.Aula6.operacoes_matematica;
import java.util.Scanner;

public class Div {
    public static void main(String[]args){
        System.out.print("Divisão\n\n");

        Scanner recebevalor = new Scanner (System.in);

        System.out.print("Informe um numero: ");

        float n1 = recebevalor.nextFloat();

        System.out.print("Informe outro numero: ");

        float n2 = recebevalor.nextFloat();

        float soma = n1 / n2;
        
        System.out.println("Asoma dos valores é: "+soma);

        recebevalor.close();
        }
}
