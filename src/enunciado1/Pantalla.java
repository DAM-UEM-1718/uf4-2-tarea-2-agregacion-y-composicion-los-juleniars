package enunciado1;

public class Pantalla {
	// Atributos

	private int pulgada;
	private String color;
	private int precio;

	// Metodos

	public Pantalla() { // Constructor
		pulgada = 26;
		precio = 200;
		color = "negra";
	}

	public String toString() {
		return "La pantalla es " + color + ", tiene " + pulgada +" pulgadas y cuesta " + precio + " Euros.";
	}
}
