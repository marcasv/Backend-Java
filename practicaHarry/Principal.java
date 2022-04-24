package practicaHarry;

public class Principal {
    public static void main (String[] args){
        Personaje harry = new Personaje("Harry Potter", "Masculino", 42, "Gryffindor");
        Personaje hermione = new Personaje("Hermione Granger", "Femenino", 43, "Gryffindor");
        Personaje voldemort = new Personaje("Lord Voldemort", "Masculino", 96, "Slytherin");
        Personaje snape = new Personaje("Severus Snape", "Masculino", 62, "Slytherin");
        Personaje dumbledore = new Personaje("Albus Dumbledore", "Masculino", 141, "Gryffindor");

        System.out.println("\n" + harry + "\n" + hermione + "\n" + voldemort + "\n" + snape + "\n" + dumbledore);
    }
}
