package pattern_observer.test1;

public class TexteObserver {

    public static void main(String[] args) {
        HeadHunter headHunter = new HeadHunter();
        headHunter.recebeOportunidade("programador");

        Observador candidato1 = new Candidato("João", headHunter);
        Observador candidato2 = new Candidato("Maria", headHunter);

        headHunter.recebeOportunidade("Arquiteto");

        Observador candidato3 = new Candidato("Jose", headHunter);
        headHunter.recebeOportunidade("Analista");

    }
}
