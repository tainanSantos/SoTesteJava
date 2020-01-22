package pattern_composite.test1;

public class Quadrado extends Figura {


    @Override
    public void desenhar() {
        System.out.print("#");
        for (Figura f: super.getFiguras())
            f.desenhar();
    }




}
