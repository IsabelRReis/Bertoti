public class Teste {
    public static void main(String[] args) {
        Atribuicao atribuicao = new Atribuicao("x", 10);
        ComandoWhile comandoWhile = new ComandoWhile("y", 5);
        ComandoComposto comandoComposto = new ComandoComposto("z", 15);

        System.out.println("Código Atribuição: " + atribuicao.geraCodigo());
        System.out.println("Código ComandoWhile: " + comandoWhile.geraCodigo());
        System.out.println("Código ComandoComposto: " + comandoComposto.geraCodigo());
    }
}