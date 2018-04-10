package enunciado1;

public class Test { // En esta clase al estar en default package te reconoce el de coche

	public static void main(String[] args) { // Vamos a crear un Objeto
		Pantalla pantalla = new Pantalla(); // Entre parentesis hemos dado valor al constructor
		Cpu cpu = new Cpu();
		Raton raton = new Raton();
		Teclado teclado = new Teclado();
		Ordenador ordenador = new Ordenador(40, "blanco", pantalla, cpu, raton, teclado);
		System.out.println(ordenador.toString());

	}
}