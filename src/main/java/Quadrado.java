public class Quadrado implements Figura {
    private static Quadrado instancia;

    private Quadrado() {}

    public static Quadrado getInstancia() {
        if (instancia == null) {
            instancia = new Quadrado();
        }
        return instancia;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um quadrado.");
    }
}
