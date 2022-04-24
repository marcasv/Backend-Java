package practicaMona;

public class Puppeter extends Mona{
    public Puppeter() {
        super();
        setOcupacion("Titiritero");
        setVestimenta("Un elegante sombrero y su mejor amigo titero en su tentaculo derecho.");
    }

    @Override
    public void saludar() {
        System.out.println("¡Titero te saluda!");
    }
}
