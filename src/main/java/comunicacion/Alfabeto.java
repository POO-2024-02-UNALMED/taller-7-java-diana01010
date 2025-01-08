package comunicacion;

import java.util.Arrays;
import java.util.List;

public class Alfabeto extends Pictograma {
    private List<String> letras;

    // Modificar el constructor para aceptar varargs
    public Alfabeto(String origen, String... letras) {
        super(origen);
        // Convertir los argumentos varargs en una lista
        this.letras = Arrays.asList(letras);
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


