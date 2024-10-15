import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrianguloTest {
    @Test
    public void testGetInstancia() {
        Triangulo triangulo1 = Triangulo.getInstancia("isósceles");
        Triangulo triangulo2 = Triangulo.getInstancia("isósceles");
        assertSame(triangulo1, triangulo2);
    }

  /*  @Test
    public void testDesenhar() {
        Triangulo triangulo = Triangulo.getInstancia("isósceles");
        triangulo.desenhar();
        // Verificar se a saída está correta
    }*/
}
