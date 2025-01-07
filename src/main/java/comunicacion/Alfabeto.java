package comunicacion;

import java.util.List;

public class Alfabeto extends Pictograma {
    private List<String> letras;

    public Alfabeto(String origen, List<String> letras) {
        super(origen);
        this.letras = letras;
    }

    public List<String> getLetras() {
        return letras;
    }

    public void setLetras(List<String> letras) {
        this.letras = letras;
    }

    public int cantidadLetras() {
        return letras.size();
    }

    @Override
    public String interpretacion() {
        return "Alfabeto latino";
    }

    @Override
    public String toString() {
        return String.join(", ", letras);
    }
}

