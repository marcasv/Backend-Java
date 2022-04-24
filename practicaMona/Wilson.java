package practicaMona;

public class Wilson extends Mona{
    public Wilson() {
        super();
        setOcupacion("Fan de los Gigantes");
        setVestimenta("Vestimenta de fanatico de los gigantes");
    }

    @Override
    public void saludar() {
        System.out.println("Perdieron los gigantes...");
    }
}