import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuadradoTest {

    @Test
    public void testGetInstancia() {
        Quadrado quadrado1 = Quadrado.getInstancia();
        Quadrado quadrado2 = Quadrado.getInstancia();
        assertSame(quadrado1, quadrado2, "As instâncias de Quadrado deveriam ser as mesmas");
    }

}
