public record Vestiario(double preco) implements Tributos {

    public final static double imposto = 0.025;

    public Vestiario(double preco) {
        this.preco = preco;
    }

    @Override
    public double calculaImposto() {
        return preco + preco * imposto;
    }
}
