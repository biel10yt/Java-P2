public class Harpa extends Instrumentos implements Trocarcorda {
    @Override
    public void tocar() {
        System.out.println("trin, trin, trin");
    }

    @Override
    public void afinar() {
        System.out.println("TRIN, TRIN");
    }

    @Override
    public void trocar_corda(){
        System.out.println("novas cordas");
    }
}
