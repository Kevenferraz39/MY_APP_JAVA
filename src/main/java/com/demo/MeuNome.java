package com.demo;
import java.util.Scanner;

public class MeuNome {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Dgite seu nome: ");

        String nome = entrada.nextLine();

        System.out.println("Olá, " + nome + "!");

        entrada.close();
    }    
}
