package pattern_decorator.test1;

public class Chocolate extends SorveteSabor {

    public Chocolate(Sorvete sorvete) {
        super(sorvete);
    }

    @Override
    public int retornarQuantidadeBolas() {
        return 1 + this.getSorvete().retornarQuantidadeBolas();
    }

    @Override
    public double getPreco() {
        return 1.50 + this.getSorvete().getPreco();
    }
}
