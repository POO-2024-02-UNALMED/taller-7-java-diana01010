package comunicacion;

public class Libro extends Escrito {
    private String coAutor;
    private String editorial;
    private String edicion;

    public Libro(String origen, String titulo, String autor, int paginas, String coAutor, String editorial, String edicion) {
        super(origen, titulo, autor, paginas);
        this.coAutor = coAutor;
        this.editorial = editorial;
        this.edicion = edicion;
    }

    public String getCoAutor() {
        return coAutor;
    }

    public void setCoAutor(String coAutor) {
        this.coAutor = coAutor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    @Override
    public int palabrasTotales(int palabrasPagina) {
        return getPaginas() * palabrasPagina * 2; // Factor para Libro es 2
    }

    @Override
    public String interpretacion() {
        return "Interpretación de libro";
    }

    @Override
    public String toString() {
        return getTitulo() + "\n" + getAutor() + "\n" + getPaginas() + "\n" + coAutor + "\n" + editorial + "\n" + edicion;
    }
}
