package pattern_adapter.test1;

public class BluRayAdapter implements ReprodutorDeVideo {

    private BluRayPlayer bluRayPlayer;

    public BluRayAdapter(BluRayPlayer bluRayPlayer) {
        this.bluRayPlayer = bluRayPlayer;
    }

    @Override
    public void reproduzir(String nome, String formato, boolean possuiAudio) {
        // fexecutando a adaptação
        this.bluRayPlayer.executar(nome, formato, 0);
    }
}
