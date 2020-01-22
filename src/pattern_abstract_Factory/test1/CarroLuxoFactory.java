package pattern_abstract_Factory.test1;

public class CarroLuxoFactory extends CarroFactory {

    @Override
    public Roda montarRoda() {
        return new RodaLigaLeve();
    }

    @Override
    public Som montarSom() {
        return new SomCdPlayer();
    }
}
