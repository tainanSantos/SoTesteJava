package pattern_strategy.test1;

public class Exponencial implements Operacao {
    @Override
    public double fazerOperacao(double n1, double n2) {

        double result = 1;
        for (int i = 1; i <= n2; i++){
            result *= n1;
        }
        return result;
    }
}
