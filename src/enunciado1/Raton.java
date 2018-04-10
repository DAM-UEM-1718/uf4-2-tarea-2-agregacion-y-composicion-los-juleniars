package enunciado1;

public class Raton {
	// Atributos

	private String cable;
	private String color;
	private int botones;

	// Metodos

	public Raton() { // Constructor
		botones = 6;
		cable = "rojo";
		color = "negro";
	}

	public String toString() {
		return "El raton es " + color + " de cable " + cable + " y tiene " + botones + " botones.";
	}
}
