package enunciado2;

import java.util.Arrays;

public class Carrera {
    private int distancia;
    private int ronda;
    private long fecha;
    private Calle[] calles;
    private int numeroCalles;

    public Carrera(int distancia, int ronda, long fecha) {
        this.distancia = distancia;
        this.ronda = ronda;
        this.fecha = fecha;
        this.calles = new Calle[8];
        this.numeroCalles = 0;
    }

    public void anadirCalle(int numero, Atleta atleta, double tiempo) {
        if (numeroCalles <= 8) {
            calles[numeroCalles] = new Calle(numero, atleta, tiempo);
            numeroCalles++;
        }
    }

    public int getDistancia() {
        return distancia;
    }

    public int getRonda() {
        return ronda;
    }

    public long getFecha() {
        return fecha;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public void setRonda(int ronda) {
        this.ronda = ronda;
    }

    public void setFecha(long fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "distancia=" + distancia +
                ", ronda=" + ronda +
                ", fecha=" + fecha +
                ", calles=" + Arrays.toString(calles) +
                ", numeroCalles=" + numeroCalles +
                '}';
    }

    public class Calle {
        int numero;
        Atleta atleta;
        double tiempo;

        public Calle(int numero, Atleta atleta, double tiempo) {
            this.numero = numero;
            this.atleta = atleta;
            this.tiempo = tiempo;
        }

        public int getNumero() {
            return numero;
        }

        public Atleta getAtleta() {
            return atleta;
        }

        public double getTiempo() {
            return tiempo;
        }

        public void setAtleta(Atleta atleta) {
            this.atleta = atleta;
        }

        public void setTiempo(double tiempo) {
            this.tiempo = tiempo;
        }
    }
}
