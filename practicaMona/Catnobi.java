package practicaMona;

public class Catnobi extends Mona{
    public Catnobi() {
        super();
        setOcupacion("Miau miau miau");
        setVestimenta("Miau miau miau miau miau miau miau miau.");
    }

    @Override
    public void saludar() {
        System.out.println("Miau miau miau miau");
    }
}
