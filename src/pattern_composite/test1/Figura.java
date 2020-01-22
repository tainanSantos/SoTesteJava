package pattern_composite.test1;

import java.util.ArrayList;
import java.util.List;


// não deve se instanciada diretamente
public abstract class Figura {

    private List<Figura> figuras;

    public abstract void desenhar();

    public Figura(){
        this.figuras = new ArrayList<>();
    }

    public void addFigura(Figura figura){
        this.figuras.add(figura);
    }

    public List<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(List<Figura> figuras) {
        this.figuras = figuras;
    }
}
