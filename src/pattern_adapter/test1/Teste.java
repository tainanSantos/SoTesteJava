package pattern_adapter.test1;

public class Teste {

    public static void main(String[] args) {

        BluRayPlayer bluRayPlayer = new BluRayPlayer();
        ReprodutorDeVideo res =  new BluRayAdapter(bluRayPlayer);
        res.reproduzir("duto de matar", "NTFC", true);

    }
}
