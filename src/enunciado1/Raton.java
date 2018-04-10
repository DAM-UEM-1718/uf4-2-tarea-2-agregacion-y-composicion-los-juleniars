package enunciado1;

public class Raton {
	// Atributos

	private String cable;
	private String color;
	private int botones;

	// Metodos

	public Raton(String cable, String color, int botones) {
		this.cable = cable;
		this.color = color;
		this.botones = botones;
	}

	public String toString() {
		return "El raton es " + color + " de cable " + cable + " y tiene " + botones + " botones.";
	}

	public String getCable() {
		return cable;
	}

	public void setCable(String cable) {
		this.cable = cable;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBotones() {
		return botones;
	}

	public void setBotones(int botones) {
		this.botones = botones;
	}
}
