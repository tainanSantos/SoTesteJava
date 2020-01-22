package pattern_observer.test1;

// algo que precisa ser observado
public interface Subject {

    public void registerObserver(Observador observador);

    public void removeObserver(Observador observador);
    public void notityAllObserver();

}
