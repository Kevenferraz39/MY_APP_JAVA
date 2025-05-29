package Curso_em_video.Aula4.Exercicios;

public class ValorDeX {
    public static void main(String[]agrs){
        
        int a = 3;
        int b = 2;
        int c = 8;
        int d = 7;

        if((a > 3) & (b < 5)){
            int x = 10;
            System.out.print("\n O valor de x é: " + x + "\n");
        }else if((a >= 2) & (c <= 1)){
            int x = (a + b)/2;
            System.out.print("\n O valor de x é: " + x + "\n");
        }else if((a == 2) & (b < 7)){
            int x = (a + b) * (b - 2);
            System.out.print("\n O valor de x é: " + x + "\n");
        }else{
            int x = ((a + c)/b * (c - d));
            System.out.print("\n O valor de x é: " + x + "\n");
        }
    } 
}
