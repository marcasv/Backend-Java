package practicaMona;

public class MonaElegante extends Mona {

    public MonaElegante() {
        super();
        setOcupacion("Soy un empresario muy exitoso.");
        setVestimenta("Un elegante sombrero y una copa de contenido desconocido, parece costoso.");
    }

    @Override
    public void saludar() {
        System.out.println("Buenas tardes, caballero.");
    }
}
