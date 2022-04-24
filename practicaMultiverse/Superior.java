import java.awt.*;

public class Superior extends SpiderMan implements SuperiorMovements {
    public Superior() {
        super("Peter Parker/Otto Octavius", "Superior Spider-Man", "Masculino", "616");
    }

    @Override
    public void spiderSense(Screen s) {
        s.cls();
        s.repaint();
        persistent(s, Colors.GloomyPurple);
        s.out("Poder: Sentido aracnido\n", "Comic Sans MS", 20, Colors.LighterPurple);
        s.showImage("./img/superior-spider-sense.jpg");
        s.setLayout(new GridBagLayout());
        powerDescription(s, "Sentido aracnido que le permite predecir peligros cercanos antes de que " +
                "sucedan, permitiendole escapar de ellos.");
    }

    @Override
    public void spiderStrength(Screen s) {
        s.cls();
        s.repaint();
        persistent(s, Colors.GloomyPurple);
        s.out("Poder: Fuerza de araña\n", "Comic Sans MS", 20, Colors.LighterPurple);
        s.showImage("./img/superior-spider-strength.jpg");
        s.setLayout(new GridBagLayout());
        powerDescription(s, "Super fuerza proporcional a la de una araña, le permite cargar objetos " +
                "cientos de veces mas pesados de los que puede cargar un humano normal.");
    }
}
