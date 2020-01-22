package pattern_observer.test1;

public class Candidato implements Observador {


    private String nome;

    public Candidato(String nome, Subject subject) {
        this.nome = nome;
        subject.registerObserver(this);
    }

    @Override
    public void update(String texto) {
        System.out.println(this.nome + " - Vaga de emprego: " + texto);
    }
}
