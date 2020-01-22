package pattern_adapter.test1;

public class VideoCassete implements ReprodutorDeVideo {

    @Override
    public void reproduzir(String nome, String formato, boolean possuiAudio) {
        System.out.print("Reproduzindo video...");
        System.out.print(nome + " no formato " + formato );
        System.out.println(possuiAudio? " com audio " : " sem audio ");
    }
}
