package pattern_decorator.test1;

public abstract  class Sorvete {

    private String nome;

    // métodos que serão implementados pelas calsses concertas
    public abstract  int retornarQuantidadeBolas();

    public abstract double getPreco();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
