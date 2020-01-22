package pattern_facade.test1;

public interface Autentication {

    public Perfil obterPerfil(Usuario usuario);
    public Usuario obterUsuario(String usuario, String senha);
}
