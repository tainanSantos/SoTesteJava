package pattern_abstract_Factory.test1;

public class CarroPopular extends CarroFactory {
    @Override
    public Roda montarRoda() {
        return new RodaSimples();
    }

    @Override
    public Som montarSom() {
        return new SomTocaFitas();
    }
}
