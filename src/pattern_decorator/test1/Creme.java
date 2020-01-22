package pattern_decorator.test1;

public class Creme extends SorveteSabor {

    public Creme(Sorvete sorvete) {
        super(sorvete);
    }

    @Override
    public int retornarQuantidadeBolas() {
        return 1 + this.getSorvete().retornarQuantidadeBolas();
    }

    @Override
    public double getPreco() {
        return 1.25 + this.getSorvete().getPreco();
    }
}
