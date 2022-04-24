import java.awt.*;

public class Cosmic extends SpiderMan implements CosmicMovements{
    public Cosmic() {
        super("Peter Parker", "Capitan Universo", "Masculino", "13");
    }

    @Override
    public void supresion(Screen s) {
        s.cls();
        s.repaint();
        persistent(s, Colors.GloomyPurple);
        s.out("Poder: supresion de habilidades\n", "Comic Sans MS", 20, Colors.LighterPurple);
        s.showImage("./img/cosmic-supresion.jpg");
        s.setLayout(new GridBagLayout());
        powerDescription(s, "Posee la capacidad de suprimir los poderes de otros mutantes o seres con " +
                "ciertas habilidades sobrehumanas haciéndolos temporal o permanentemente vulnerables como un ser " +
                "humano común.");
    }

    @Override
    public void invulnerabilidad(Screen s) {
        s.cls();
        s.repaint();
        persistent(s, Colors.GloomyPurple);
        s.out("Poder: Invulnerabilidad\n", "Comic Sans MS", 20, Colors.LighterPurple);
        s.showImage("./img/cosmic-invulnerabilidad.jpg");
        s.setLayout(new GridBagLayout());
        powerDescription(s, "La piel de Spider-Man después de ganar el Uni-Poder fue diseñada para " +
                "soportar fácilmente los rigores de los viajes en el espacio profundo, y hasta el momento, ha " +
                "demostrado ser casi virtualmente indestructible.");
    }
}
