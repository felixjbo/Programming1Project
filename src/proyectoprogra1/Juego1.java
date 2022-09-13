package proyectoprogra1;

import static java.lang.Integer.parseInt;
import java.util.Random;
import javax.swing.JOptionPane;

public class Juego1 {

    public Juego1() {
        Jugar();
    }

    public static void Jugar() {
        int ProblemaAleatorio = Random();
        switch (ProblemaAleatorio) {
            case 0:
                Problema1 problema1 = new Problema1();
                problema1.setVisible(true);
                break;
            case 1:
                Problema2 problema2 = new Problema2();
                problema2.setVisible(true);
                break;
            case 2:
                Problema3 problema3 = new Problema3();
                problema3.setVisible(true);
                break;
            case 3:
                Problema4 problema4 = new Problema4();
                problema4.setVisible(true);
                break;
            case 4:
                Problema5 problema5 = new Problema5();
                problema5.setVisible(true);
                break;
        }
                
}

    public static int Random() {
        Random rand = new Random();
        return rand.nextInt(5);
    }
    }