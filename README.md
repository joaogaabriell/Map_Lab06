# Lab 06 — Fábrica de Figuras (Padrões Singleton e Factory)

Atividade de laboratório da disciplina de **Métodos Avançados de Programação (MAP)**.

## Sobre o projeto

Combinação dos padrões de criação **Singleton** e **Factory**:

- `FabricaFigura` é um **Singleton** responsável por criar as figuras (`criarCirculo()`, `criarQuadrado()`, `criarTriangulo(tipo)`).
- `Circulo` e `Quadrado` também são **Singletons** — existe apenas uma instância de cada.
- `Triangulo` usa uma variação **Multiton**: mantém um `Map` com uma instância única por tipo (isósceles, equilátero, retângulo).
- Todas as figuras implementam a interface `Figura`, com o método `desenhar()`.

## Tecnologias

- Java
- Maven
- JUnit 5 (testes unitários)

## Como executar

```bash
mvn compile exec:java -Dexec.mainClass="Main"
```

Ou abra o projeto em uma IDE (IntelliJ, Eclipse) e execute a classe `Main`.

## Testes

```bash
mvn test
```

Os testes verificam, entre outras coisas, que as instâncias retornadas são realmente únicas (mesma referência).
