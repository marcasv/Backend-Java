import java.awt.*;

public class Principal {
    public static void main(String[] args) throws InterruptedException {
        Screen s = new Screen("Spiderverse");
        s.setVisible(true);
        // Define la posicion y dimensiones del Screen, favor de no modificar
        s.setBounds(0, 0, 950, 750);

        Dialog d = new Dialog();

        // Los ifs verifican si el programa debe ser terminado
        if (silk(s,d) != 0) {
            // Termina el programa
            System.exit(0);
        }

        if (superior(s,d) != 0) {
            // Termina el programa
            System.exit(0);
        }

        if (cosmic(s,d) != 0) {
            // Termina el programa
            System.exit(0);
        }
    }

    static int silk(Screen s, Dialog d) throws InterruptedException {
        Silk silk = new Silk();

        silk.superiorSpiderSense(s);
        if (d.confirm("Next? (Yes) | Quit (No or Cancel)", d.tit) != 0) {
            return 1;
        }

        silk.organicWebs(s);
        if (d.confirm("Next? (Yes) | Quit (No or Cancel)", d.tit) != 0) {
            return 1;
        }
        return 0;
    }

    static int superior(Screen s, Dialog d) throws InterruptedException {
        Superior superior = new Superior();

        superior.spiderSense(s);
        if (d.confirm("Next? (Yes) | Quit (No or Cancel)", d.tit) != 0) {
            return 1;
        }

        superior.spiderStrength(s);
        if (d.confirm("Next? (Yes) | Quit (No or Cancel)", d.tit) != 0) {
            return 1;
        }
        return 0;
    }

    static int cosmic(Screen s, Dialog d) throws InterruptedException {
        Cosmic cosmic = new Cosmic();

        cosmic.invulnerabilidad(s);
        if (d.confirm("Next? (Yes) | Quit (No or Cancel)", d.tit) != 0) {
            return 1;
        }

        cosmic.supresion(s);
        if (d.confirm("Next? (Yes) | Quit (No or Cancel)", d.tit) != 0) {
            return 1;
        }
        return 0;
    }
}
