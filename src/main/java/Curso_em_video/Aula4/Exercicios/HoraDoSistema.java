package Curso_em_video.Aula4.Exercicios;

import java.util.Date;
import java.util.Locale;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.HeadlessException;

public class HoraDoSistema {
    public static void main(String[] args) {
        Date Relogio = new Date();
        System.out.println("A hora do meu sistema é:");
        System.out.println(Relogio.toString());
    }

}


class IdiomaDoSistema {
    public static void main(String[] args) {
        Locale idioma = Locale.getDefault(); // pega o idioma atual do sistema
        System.out.println("O idioma do sistema é: " + idioma.getDisplayLanguage());
    }
}

class TamanhoDaTela {
    public static void main(String[] args) {
        try {
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int largura = (int) screenSize.getWidth();
            int altura = (int) screenSize.getHeight();
            System.out.println("A resolução da tela é: " + largura + " x " + altura);
        } catch (HeadlessException e) {
            System.out.println("⚠️ Ambiente headless: não é possível obter a resolução da tela.");
        }
    }
}
