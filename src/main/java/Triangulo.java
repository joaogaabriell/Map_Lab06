import java.util.HashMap;
import java.util.Map;

public class Triangulo implements Figura {
    private static final Map<String, Triangulo> instancias = new HashMap<>();
    private final String tipo;

    private Triangulo(String tipo) {
        this.tipo = tipo;
    }

    public static Triangulo getInstancia(String tipo) {
        return instancias.computeIfAbsent(tipo, Triangulo::new);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um triângulo " + tipo + ".");
    }
}
