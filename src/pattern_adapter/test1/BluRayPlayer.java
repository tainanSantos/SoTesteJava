package pattern_adapter.test1;

public class BluRayPlayer {

    public void executar( String nome, String formato, double tamanho){
        System.out.print("Reproduzindo video...");
        System.out.print(nome + " no formato " + formato );
        System.out.println(" tamanho do vídeo: " + tamanho);
    }
}
