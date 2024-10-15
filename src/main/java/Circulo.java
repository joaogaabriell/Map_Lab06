public class Circulo implements Figura {
    private static Circulo instancia;

    private Circulo() {}

    public static Circulo getInstancia() {
        if (instancia == null) {
            instancia = new Circulo();
        }
        return instancia;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um círculo.");
    }
}
