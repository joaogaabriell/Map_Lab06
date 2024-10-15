public class Triangulo implements Figura {
    private static Triangulo instancia;
    private String tipo;

    private Triangulo(String tipo) {
        this.tipo = tipo;
    }

    public static Triangulo getInstancia(String tipo) {
        if (instancia == null) {
            instancia = new Triangulo(tipo);
        }
        return instancia;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um triângulo " + tipo + ".");
    }
}
