package pattern_composite.test1;

public class Circulo  extends  Figura{

    @Override
    public void desenhar() {
        System.out.print("o");
        for (Figura f: super.getFiguras())
            f.desenhar();
    }
}
