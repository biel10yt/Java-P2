public class Main {
    public static void main(String[] args) {
        Teste t = new Teste();
        System.out.println("Funções dos Intrumentos");
        System.out.println("Harpa");
        t.tocar(new Harpa());
        t.afinar(new Harpa());
        t.trocar_corda(new Harpa());
        System.out.println("Violão");
        t.tocar(new Violão());
        t.afinar(new Violão());
        t.trocar_corda(new Violão());
        System.out.println("Flauta");
        t.tocar(new Flauta());
        t.afinar(new Flauta());
    }
}
