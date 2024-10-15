public class FabricaFigura {
    private static FabricaFigura instancia;

    private FabricaFigura() {}

    public static FabricaFigura getInstancia() {
        if (instancia == null) {
            try {
                instancia = new FabricaFigura();
            } catch (Exception e) {
                System.err.println("Erro ao criar a instância de FabricaFigura: " + e.getMessage());
                throw new RuntimeException("Falha ao criar a instância de FabricaFigura", e);
            }
        }
        return instancia;
    }

    public Figura criarCirculo() {
        try {
            return Circulo.getInstancia();
        } catch (Exception e) {
            System.err.println("Erro ao criar Circulo: " + e.getMessage());
            throw new RuntimeException("Falha ao criar Circulo", e);
        }
    }

    public Figura criarTriangulo(String tipo) {
        try {
            return Triangulo.getInstancia(tipo);
        } catch (Exception e) {
            System.err.println("Erro ao criar Triangulo: " + e.getMessage());
            throw new RuntimeException("Falha ao criar Triangulo", e);
        }
    }

    public Figura criarQuadrado() {
        try {
            return Quadrado.getInstancia();
        } catch (Exception e) {
            System.err.println("Erro ao criar Quadrado: " + e.getMessage());
            throw new RuntimeException("Falha ao criar Quadrado", e);
        }
    }
}
