package pattern_strategy.test1;

public class CalculadoraSoma extends Caculadora {

    public CalculadoraSoma(){
        super(new Soma());
    }

}
