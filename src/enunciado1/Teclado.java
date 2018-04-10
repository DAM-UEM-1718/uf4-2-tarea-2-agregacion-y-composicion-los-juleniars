package enunciado1;

public class Teclado {
	// Atributos

	private int tamaño;
	private String color;
	private int teclas;

	// Metodos

	public Teclado() { // Constructor
		teclas = 36;
		tamaño = 17;
		color = "negro";
	}

	public String toString() {
		return "El teclado es " + color + " es de " + tamaño + " cm y tiene " + teclas + " teclas.";
	}
}
