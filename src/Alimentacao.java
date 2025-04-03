public record Alimentacao(double preco) implements Tributos{

    public final static double imposto = 0.01;

    public Alimentacao(double preco) {
        this.preco = preco;
    }

    @Override
    public double calculaImposto() {
        return preco + preco * imposto;
    }
}
