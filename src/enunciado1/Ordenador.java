package enunciado1;

public class Ordenador {
	// Atributos

	private int tamaño;
	private String color;
	private Pantalla ordenadorPantalla;
	private Cpu ordenadorCpu;
	private Raton ordenadorRaton;
	private Teclado ordenadorTeclado;

	// Metodos

	public Ordenador(int tamaño, String color, Pantalla ordenadorPantalla, Cpu ordenadorCpu, Raton ordenadorRaton,
			Teclado ordenadorTeclado) { // Constructor
		this.tamaño = tamaño;
		this.color = color;
		this.ordenadorPantalla = ordenadorPantalla;
		this.ordenadorCpu = ordenadorCpu;
		this.ordenadorRaton = ordenadorRaton;
		this.ordenadorTeclado = ordenadorTeclado;

	}

	public double gettamaño() {
		return tamaño;
	}

	public void settamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public String getcolor() {
		return color;
	}

	public void setcolor(String color) {
		this.color = color;
	}

	public Pantalla getordenadorPantalla() {
		return ordenadorPantalla;
	}

	public void setordenadorPantalla(Pantalla ordenadorPantalla) {
		this.ordenadorPantalla = ordenadorPantalla;
	}

	public Cpu getordenadorCpu() {
		return ordenadorCpu;
	}

	public void setordenadorCpu(Cpu ordenadorCpu) {
		this.ordenadorCpu = ordenadorCpu;
	}

	public Raton getordenadorRaton() {
		return ordenadorRaton;
	}

	public void setordenadorRaton(Raton ordenadorRaton) {
		this.ordenadorRaton = ordenadorRaton;
	}

	public Teclado getordenadorTeclado() {
		return ordenadorTeclado;
	}

	public void setordenadorTeclado(Teclado ordenadorTeclado) {
		this.ordenadorTeclado = ordenadorTeclado;
	}

	public String toString() {
		return "La torre del ordenador es de: " + tamaño + " cm, de color " + color + " y esta compuesta por: " + "\n" + ordenadorPantalla.toString() + "\n"	+ ordenadorCpu.toString() + "\n" + ordenadorRaton.toString() + "\n"+ ordenadorTeclado.toString();
	}

}
