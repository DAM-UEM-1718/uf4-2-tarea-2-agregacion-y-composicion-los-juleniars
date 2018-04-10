package enunciado1;

public class Cpu {
	// Atributos

	private String procesador;
	private String grafica;
	private int generacion;

    public Cpu(String procesador, String grafica, int generacion) {
        this.procesador = procesador;
        this.grafica = grafica;
        this.generacion = generacion;
    }

    // Metodos


	public String toString() {
		return "La CPU tiene un procesador de marca " + procesador + ", de generacion " + generacion + " y tiene una grafica " + grafica +"." ;
	}

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getGrafica() {
        return grafica;
    }

    public void setGrafica(String grafica) {
        this.grafica = grafica;
    }

    public int getGeneracion() {
        return generacion;
    }

    public void setGeneracion(int generacion) {
        this.generacion = generacion;
    }
}
