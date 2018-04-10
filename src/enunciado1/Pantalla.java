package enunciado1;

public class Pantalla {
	// Atributos

	private int pulgada;
	private String color;
	private int precio;

	// Metodos


	public Pantalla(int pulgada, String color, int precio) {
		this.pulgada = pulgada;
		this.color = color;
		this.precio = precio;
	}

	public String toString() {
		return "La pantalla es " + color + ", tiene " + pulgada +" pulgadas y cuesta " + precio + " Euros.";
	}

	public int getPulgada() {
		return pulgada;
	}

	public void setPulgada(int pulgada) {
		this.pulgada = pulgada;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
}
