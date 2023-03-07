public class Verfic {

    public static void main(String[] args) {
        IdUser id = new IdUser();
        Senha se = new Senha();

        String use = id.use();
        String senha = se.senha();
        String user = id.user();

        if (use.equals(user)) {
            if (senha.equals(se.cfSenha())) {
                System.out.print("Entrada permitida");
            } else {
                System.out.print("Senha incorreto.");
            }
        } else {
            System.out.print("Usuário incorreto.");
        }
    }
}
