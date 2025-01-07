package comunicacion;

public class Periodico extends Escrito {
    private String fecha;
    private String primicia;

    public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia) {
        super(origen, titulo, autor, paginas);
        this.fecha = fecha;
        this.primicia = primicia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPrimicia() {
        return primicia;
    }

    public void setPrimicia(String primicia) {
        this.primicia = primicia;
    }

    @Override
    public int palabrasTotales(int palabrasPagina) {
        return getPaginas() * palabrasPagina * 10; // Factor para Periodico es 10
    }

    @Override
    public String interpretacion() {
        return "Escrito informativo";
    }

    @Override
    public String toString() {
        return getOrigen() + "\n" + getTitulo() + "\n" + getAutor() + "\n" + getPaginas() + "\n" + fecha + "\n" + primicia;
    }
}

