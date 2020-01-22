package pattern_decorator.test1;

public abstract class SorveteSabor extends  Sorvete {

    // necessário pois estamos fazendod uso do padrão Decorator
    private Sorvete sorvete;

    public SorveteSabor(Sorvete sorvete) {
        this.sorvete = sorvete;
        this.setNome(sorvete.getNome());
    }

    public Sorvete getSorvete() {
        return sorvete;
    }
}
