public class Main {
    public static void main(String[] args) {
        ContaBanco marcos = new ContaBanco();

        marcos.abrirConta("cc");
        marcos.setDono("Marcos");
        marcos.setNumConta(8484);
        marcos.sacar(10);
        marcos.setStatus(true);
        marcos.depositar(20);
        marcos.dados();
    }
}