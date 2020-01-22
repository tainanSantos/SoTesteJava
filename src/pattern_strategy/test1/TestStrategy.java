package pattern_strategy.test1;

public class TestStrategy {

    public static void main(String[] args) {

        Caculadora caculadora = new CalculadoraSoma();
        
        System.out.println("O resultado da operação é = "
                + caculadora.realizarOperacao(5.5,3));
    }
}
