package enunciado1;

public class Teclado {
	// Atributos

	private int tama�o;
	private String color;
	private int teclas;

	// Metodos

	public Teclado() { // Constructor
		teclas = 36;
		tama�o = 17;
		color = "negro";
	}

	public String toString() {
		return "El teclado es " + color + " es de " + tama�o + " cm y tiene " + teclas + " teclas.";
	}
}
