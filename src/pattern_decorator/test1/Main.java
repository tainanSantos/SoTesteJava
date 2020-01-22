package pattern_decorator.test1;

public class Main {
    public static void main(String[] args) {

        Sorvete sorvete = new SorveteNapolitano();
        retornaInformacao(sorvete);
        sorvete = new Creme(sorvete);
        retornaInformacao(sorvete);
        sorvete = new Chocolate(sorvete);
        retornaInformacao(sorvete);
        sorvete = new Morango(sorvete);
        retornaInformacao(sorvete);

    }

    public static void retornaInformacao(Sorvete sorvete){
        System.out.println(sorvete.getNome() + " - " +
                sorvete.retornarQuantidadeBolas() + " - " +
                " preço: "+sorvete.getPreco());
    }
}
