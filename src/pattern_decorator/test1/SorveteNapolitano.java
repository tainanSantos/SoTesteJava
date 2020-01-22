package pattern_decorator.test1;

public class SorveteNapolitano extends Sorvete {

    public SorveteNapolitano(){
        this.setNome("Sorvete Napolitano");
    }

    @Override
    public int retornarQuantidadeBolas() {
        return 0;
    }

    @Override
    public double getPreco() {
        return 2.5;
    }
}
