package pattern_abstract_Factory.test1;

public class Carro {

    private Roda roda;
    private Som som;


    public Carro(){

    }

    public Roda getRoda() {
        return roda;
    }

    public void setRoda(Roda roda) {
        this.roda = roda;
    }

    public Som getSom() {
        return som;
    }

    public void setSom(Som som) {
        this.som = som;
    }
}
