package comunicacion;

import java.util.List;

public class Tesis extends Escrito {
    private List<String> argumentos;
    private String conclusion;
    private String referencias;

    public Tesis(String origen, String titulo, String autor, int paginas, List<String> argumentos, String conclusion, String referencias) {
        super(origen, titulo, autor, paginas);
        this.argumentos = argumentos;
        this.conclusion = conclusion;
        this.referencias = referencias;
    }

    public List<String> getArgumentos() {
        return argumentos;
    }

    public void setArgumentos(List<String> argumentos) {
        this.argumentos = argumentos;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getReferencias() {
        return referencias;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    @Override
    public int palabrasTotales(int palabrasPagina) {
        return getPaginas() * palabrasPagina * 5; // Factor para Tesis es 5
    }

    @Override
    public String interpretacion() {
        return "Interpretación de tesis";
    }

    @Override
    public String toString() {
        return getTitulo() + "\n" + getAutor() + "\n" + getPaginas() + "\n" + conclusion + "\n" + referencias;
    }
}
