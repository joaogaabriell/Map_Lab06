public class Quadrado implements Figura {
    private static Quadrado instancia;

    private Quadrado() {}

    public static Quadrado getInstancia() {
        if (instancia == null) {
            try {
                instancia = new Quadrado();
            } catch (Exception e) {
                System.err.println("Erro ao criar a instância de Quadrado: " + e.getMessage());
                // Pode lançar uma exceção específica ou tratar de outra forma, dependendo da necessidade
                throw new RuntimeException("Falha ao criar a instância de Quadrado", e);
            }
        }
        return instancia;
    }

    @Override
    public char desenhar() {
        try {
            System.out.println("Desenhando um quadrado.");
        } catch (Exception e) {
            System.err.println("Erro ao desenhar o quadrado: " + e.getMessage());
            // Pode lançar uma exceção específica ou tratar de outra forma, dependendo da necessidade
            throw new RuntimeException("Falha ao desenhar o quadrado", e);
        }
        return 0;
    }
}
