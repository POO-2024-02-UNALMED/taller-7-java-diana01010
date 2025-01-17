package comunicacion;

public class Fabula extends Escrito {
    private String ensenanza;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza) {
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
    }

    public String getEnsenanza() {
        return ensenanza;
    }

    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    @Override
    public int palabrasTotales(int palabrasPagina) {
        return getPaginas() * palabrasPagina * 1; 
    }

    @Override
    public String interpretacion() {
        return "Cuento corto";
    }

    @Override
    public String toString() {
        return getOrigen() + "\n" + getTitulo() + "\n" + getAutor() + "\n" + getPaginas() + "\n" + ensenanza;
    }
}

