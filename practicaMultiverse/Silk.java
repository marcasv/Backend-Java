import java.awt.*;

public class Silk extends SpiderMan implements SilkMovements{
    public Silk() {
        super("Cindy Moon", "Silk", "Femenino", "616");
    }

    @Override
    public void superiorSpiderSense(Screen s) {
        s.cls();
        s.repaint();
        persistent(s, Colors.GloomyPurple);
        s.out("Poder: Spider-Sense\n", "Comic Sans MS", 20, Colors.LighterPurple);
        s.showImage("./img/silk-spider-sense.jpg");
        powerDescription(s, "Sentido aracnido superior al de Peter Parker, capaz de advertir a Cindy " +
                "del peligro a un mayor rango de distancia y tiempo.");
    }

    @Override
    public void organicWebs(Screen s) {
        s.cls();
        s.repaint();
        persistent(s, Colors.GloomyPurple);
        s.out("Poder: Organic webs\n", "Comic Sans MS", 20, Colors.LighterPurple);
        s.showImage("./img/silk-organic-webs.jpg");
        s.setLayout(new GridBagLayout());
        powerDescription(s, "A diferencia de otros Spider-Man, Silk no tiene la necesidad de utilizar " +
                "lanzadores de telaraña, pues la picadura de la araña radiactiva le concedio el poder de lanzar " +
                "telarañas desde su propio cuerpo.");
    }
}
