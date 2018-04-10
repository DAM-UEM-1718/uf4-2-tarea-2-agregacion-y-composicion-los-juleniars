package enunciado1;

public class Cpu {
	// Atributos

	private String procesador;
	private String grafica;
	private int generacion;

	// Metodos

	public Cpu() { // Constructor
		generacion = 6;
		procesador = "Intel";
		grafica = "Nvidia";
	}

	public String toString() {
		return "La CPU tiene un procesador de marca " + procesador + ", de generacion " + generacion + " y tiene una grafica " + grafica +"." ;
	}
}