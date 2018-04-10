package enunciado2;

/**
 * @author Andrés Murillas e Iván Hernández
 */
public class Test {
    public static void main(String[] args) {
        Carrera maraton = new Carrera(100, 3, 23);
        Atleta atleta1 = new Atleta("Julen", 10031996);
        maraton.anadirCalle(2, atleta1, 877);
        System.out.println(maraton);
    }
}
