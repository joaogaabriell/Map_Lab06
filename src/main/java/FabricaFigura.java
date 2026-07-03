public class FabricaFigura {
    private static FabricaFigura instancia;

    private FabricaFigura() {}

    public static FabricaFigura getInstancia() {
        if (instancia == null) {
            instancia = new FabricaFigura();
        }
        return instancia;
    }

    public Figura criarCirculo() {
        return Circulo.getInstancia();
    }

    public Figura criarTriangulo(String tipo) {
        return Triangulo.getInstancia(tipo);
    }

    public Figura criarQuadrado() {
        return Quadrado.getInstancia();
    }
}
