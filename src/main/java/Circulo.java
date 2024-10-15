public class Circulo implements Figura {
    private static Circulo instancia;

    private Circulo() {}

    public static Circulo getInstancia() {
        if (instancia == null) {
            try {
                instancia = new Circulo();
            } catch (Exception e) {
                System.err.println("Erro ao criar a instância de Circulo: " + e.getMessage());
                throw new RuntimeException("Falha ao criar a instância de Circulo", e);
            }
        }
        return instancia;
    }

    @Override
    public char desenhar() {
        try {
            System.out.println("Desenhando um círculo.");
        } catch (Exception e) {
            System.err.println("Erro ao desenhar o círculo: " + e.getMessage());
            throw new RuntimeException("Falha ao desenhar o círculo", e);
        }
        return 0;
    }
}
