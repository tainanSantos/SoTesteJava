package pattern_abstract_Factory.test1;

public class Main {

    private static  Carro montarCarro(String tipo){
        CarroFactory cf  = null;
        switch (tipo){
            case "luxo":
                cf= new CarroLuxoFactory();
                break;
            case "popular":
                cf = new CarroPopular();
                break;
        }
        Carro carro = new Carro();
        carro.setRoda(cf.montarRoda());
        carro.setSom(cf.montarSom());
        return carro;
    }

    public static void main(String[] args) {
        Carro c1 = montarCarro("luxo");
        Carro c2 = montarCarro("popular");
    }
}
