import java.util.HashMap;
import java.util.Map;

public class Triangulo implements Figura {
    private static final Map<String, Triangulo> instancias = new HashMap<>();
    private String tipo;

    private Triangulo(String tipo) {
        this.tipo = tipo;
    }

    public static Triangulo getInstancia(String tipo) {
        try {
            if (!instancias.containsKey(tipo)) {
                instancias.put(tipo, new Triangulo(tipo));
            }
            return instancias.get(tipo);
        } catch (Exception e) {
            System.err.println("Erro ao criar a instância de Triangulo: " + e.getMessage());
            throw new RuntimeException("Falha ao criar a instância de Triangulo", e);
        }
    }

    @Override
    public char desenhar() {
        try {
            System.out.println("Desenhando um triângulo " + tipo + ".");
        } catch (Exception e) {
            System.err.println("Erro ao desenhar o triângulo: " + e.getMessage());
            throw new RuntimeException("Falha ao desenhar o triângulo", e);
        }
        return 0;
    }
}
