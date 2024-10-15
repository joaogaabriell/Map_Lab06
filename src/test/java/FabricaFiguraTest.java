import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FabricaFiguraTest {
    @Test
    public void testGetInstancia() {
        FabricaFigura fabrica1 = FabricaFigura.getInstancia();
        FabricaFigura fabrica2 = FabricaFigura.getInstancia();
        assertSame(fabrica1, fabrica2);
    }

    @Test
    public void testCriarCirculo() {
        FabricaFigura fabrica = FabricaFigura.getInstancia();
        Figura circulo = fabrica.criarCirculo();
        assertTrue(circulo instanceof Circulo);
    }

    @Test
    public void testCriarTriangulo() {
        FabricaFigura fabrica = FabricaFigura.getInstancia();
        Figura triangulo = fabrica.criarTriangulo("isósceles");
        assertTrue(triangulo instanceof Triangulo);
    }

    @Test
    public void testCriarQuadrado() {
        FabricaFigura fabrica = FabricaFigura.getInstancia();
        Figura quadrado = fabrica.criarQuadrado();
        assertTrue(quadrado instanceof Quadrado);
    }
}
