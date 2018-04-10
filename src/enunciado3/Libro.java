package enunciado3;

import java.util.LinkedList;

/**
 * @author Julen Bujanda
 */
public class Libro {

    private String titulo;

    private long isbn;

    private int anoPublicacion;

    private String autor;

    private LinkedList<Pagina> paginas;

    public Libro(String titulo, long isbn, int anoPublicacion, String autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.anoPublicacion = anoPublicacion;
        this.autor = autor;
        this.paginas = new LinkedList<Pagina>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void addPagina(String contenido) {
        paginas.add(new Pagina(contenido, paginas.size() + 1));
    }

    @Override
    public String toString() {
        String paginasLibro = "";
        for (Pagina pagina :
                paginas) {
            paginasLibro += pagina;
        }
        return "Libro: " +
                "\nTítulo: " + titulo +
                "\nISBN: " + isbn +
                "\nAño de Publicación: " + anoPublicacion +
                "\nAutor:" + autor +
                "\nPáginas: " + paginasLibro;
    }

    private class Pagina {

        private String contenido;

        private int numero;

        public Pagina(String contenido, int numero) {
            this.contenido = contenido;
            this.numero = numero;
        }

        public String getContenido() {
            return contenido;
        }

        public void setContenido(String contenido) {
            this.contenido = contenido;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        @Override
        public String toString() {
            return "\n Página " + numero + ": " +
                    "\n  Contenido: " + contenido;
        }
    }


}
