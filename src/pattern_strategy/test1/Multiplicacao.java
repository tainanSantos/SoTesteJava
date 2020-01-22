package pattern_strategy.test1;

public class Multiplicacao implements Operacao {
    @Override
    public double fazerOperacao(double n1, double n2) {
        return n1 * n2;
    }
}
