public record Cultura(double preco) implements Tributos {

    public final static double imposto = 0.04;


    public Cultura(double preco) {
        this.preco = preco;
    }

    @Override
    public double calculaImposto() {
        return preco + preco * imposto;
    }
}
