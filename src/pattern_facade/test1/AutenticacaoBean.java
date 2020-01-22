package pattern_facade.test1;


public class AutenticacaoBean implements Autentication{

    @Override
    public Perfil obterPerfil(Usuario usuario) {
        PerfilDAO p =  new PerfilDAO();
        return p.obterPerfil(usuario);
    }

    @Override
    public Usuario obterUsuario(String usuario, String senha) {
        UsuarioDAO u = new UsuarioDAO();
        return u.getUsuario(usuario, senha);
    }
}
