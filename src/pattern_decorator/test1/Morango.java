package pattern_decorator.test1;

public class Morango  extends SorveteSabor {

    public Morango(Sorvete sorvete) {
        super(sorvete);
    }

    @Override
    public int retornarQuantidadeBolas() {
        return 1 + this.getSorvete().retornarQuantidadeBolas();
    }

    @Override
    public double getPreco() {
        return 1.75 + this.getSorvete().getPreco();
    }
}
