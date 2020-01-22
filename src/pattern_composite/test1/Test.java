package pattern_composite.test1;

public class Test {

    public static void main(String[] args) {
        Figura figura = new Quadrado();
        figura.addFigura(new Quadrado());

        Figura figura1 = new Circulo();
        figura1.addFigura(new Circulo());
        figura.addFigura(figura1);
        figura.desenhar();

    }

}
