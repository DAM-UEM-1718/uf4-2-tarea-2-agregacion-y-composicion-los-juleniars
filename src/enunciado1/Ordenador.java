package enunciado1;

public class Ordenador {
    // Atributos

    private int tamano;
    private String color;
    private Pantalla ordenadorPantalla;
    private Cpu ordenadorCpu;
    private Raton ordenadorRaton;
    private Teclado ordenadorTeclado;

    // Metodos

    public Ordenador(int tamano, String color, Pantalla ordenadorPantalla, Cpu ordenadorCpu, Raton ordenadorRaton,
                     Teclado ordenadorTeclado) { // Constructor
        this.tamano = tamano;
        this.color = color;
        this.ordenadorPantalla = ordenadorPantalla;
        this.ordenadorCpu = ordenadorCpu;
        this.ordenadorRaton = ordenadorRaton;
        this.ordenadorTeclado = ordenadorTeclado;

    }

    public double gettamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
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
        return "La torre del ordenador es de: " + tamano + " cm, de color " + color + " y esta compuesta por: " + "\n" + ordenadorPantalla.toString() + "\n" + ordenadorCpu.toString() + "\n" + ordenadorRaton.toString() + "\n" + ordenadorTeclado.toString();
    }

}
