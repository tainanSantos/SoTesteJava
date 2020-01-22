package pattern_observer.test1;

import java.util.ArrayList;
import java.util.List;

public class HeadHunter implements Subject {

    private List<Observador> observadors;
    private List<String> oportunidades;

    public HeadHunter(){
        this.observadors = new ArrayList<>();
        this.oportunidades =  new ArrayList<>();
    }

    public void  recebeOportunidade(String oportunidade){
        this.oportunidades.add(oportunidade);
        this.notityAllObserver();
    }


    @Override
    public void registerObserver(Observador observador) {
        this.observadors.add(observador);
    }

    @Override
    public void removeObserver(Observador observador) {
        int ind = this.observadors.indexOf(observador);
        if (ind >= 0) this.observadors.remove(observador);
    }

    @Override
    public void notityAllObserver() {
        for (Observador observador : observadors){
            observador.update(this.oportunidades.get(this.oportunidades.size()-1));
        }
    }
}
