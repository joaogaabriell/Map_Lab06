public class Main {
    public static void main(String[] args) {
        FabricaFigura fabrica = FabricaFigura.getInstancia();

        Figura circulo = fabrica.criarCirculo();
        circulo.desenhar();

        Figura trianguloIsosceles = fabrica.criarTriangulo("isósceles");
        trianguloIsosceles.desenhar();

        Figura trianguloEquilatero = fabrica.criarTriangulo("equilátero");
        trianguloEquilatero.desenhar();

        Figura trianguloRetangulo = fabrica.criarTriangulo("retângulo");
        trianguloRetangulo.desenhar();

        Figura quadrado1 = fabrica.criarQuadrado();
        quadrado1.desenhar();

        Figura quadrado2 = fabrica.criarQuadrado();
        quadrado2.desenhar();
    }
}
