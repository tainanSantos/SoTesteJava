package pattern_strategy.test1;

import java.util.Calendar;

public abstract class Caculadora {

    private Operacao operacao;

    public Caculadora(Operacao operacao) {
        this.operacao = operacao;
    }


    public Caculadora(){

    }

    public Caculadora definirOperacao(Operacao operacao){
        this.operacao = operacao;
        return this;
    }

    public double realizarOperacao(double n1, double n2){
        // valer o conceito do strategy
        return this.operacao.fazerOperacao(n1,n2);
    }

}
