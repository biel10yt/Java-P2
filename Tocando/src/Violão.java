public class Violão extends Instrumentos implements Trocarcorda {
    @Override
    public void tocar() {
        System.out.println("do, re , mi ");
    }

    @Override
    public void afinar() {
        System.out.println("DO, RE, MI");
    }
    @Override
    public void trocar_corda(){
        System.out.println("novas cordas");
    }
}
