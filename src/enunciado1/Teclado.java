package enunciado1;

public class Teclado {
	// Atributos

	private int tamano;
	private String color;
	private int teclas;

	// Metodos

	public Teclado(int tamano, String color, int teclas) {
		this.tamano = tamano;
		this.color = color;
		this.teclas = teclas;
	}

	public String toString() {
		return "El teclado es " + color + " es de " + tamano + " cm y tiene " + teclas + " teclas.";
	}

	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getTeclas() {
		return teclas;
	}

	public void setTeclas(int teclas) {
		this.teclas = teclas;
	}
}
