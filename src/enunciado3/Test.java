package enunciado3;

public class Test {

    public static void main(String[] args) {
        Libro libro = new Libro("Lo Que El Viento Se Llevó", 9784003234242L, 1936, "Margaret Mitchell");
        libro.addPagina("Lorem ipsum dolor sit amet, sit praesent torquatos ea," +
                " adipiscing eloquentiam cum eu, an pri partem noster. Eam at hinc aeque pertinacia," +
                " qui fugit deleniti vivendum te. Eros choro conceptam quo ei, erant animal corrumpit " +
                "vis at, ea mea euismod voluptua. An cum wisi inani noster.");
        System.out.println(libro);
    }

}
