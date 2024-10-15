import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrianguloTest {

    @Test
    public void testGetInstancia() {
        Triangulo triangulo1 = Triangulo.getInstancia("isósceles");
        Triangulo triangulo2 = Triangulo.getInstancia("isósceles");
        assertSame(triangulo1, triangulo2, "As instâncias de Triangulo deveriam ser as mesmas para o mesmo tipo");
    }


}
