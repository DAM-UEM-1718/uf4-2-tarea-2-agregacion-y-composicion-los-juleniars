package enunciado1;

/**
 * @author Víctor Jiménez Gómez
 */
public class Test { // En esta clase al estar en default package te reconoce el de coche

    public static void main(String[] args) { // Vamos a crear un Objeto
        Pantalla pantalla = new Pantalla(19, "Negro", 199); // Entre parentesis hemos dado valor al constructor
        Cpu cpu = new Cpu("Intel", "Nvidia", 7);
        Raton raton = new Raton("Rojo", "Negro", 6);
        Teclado teclado = new Teclado(17, "Negro", 36);
        Ordenador ordenador = new Ordenador(40, "blanco", pantalla, cpu, raton, teclado);
        System.out.println(ordenador.toString());

    }
}