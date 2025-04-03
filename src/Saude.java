public record Saude(double preco) implements Tributos {

    public final static double imposto = 0.015;

    public Saude(double preco){
        this.preco = preco;
    }


    @Override
    public double calculaImposto() {
        return preco + preco * imposto;
    }
}
