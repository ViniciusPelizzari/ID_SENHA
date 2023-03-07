import java.util.Scanner;

public class Senha {
    Scanner s = new Scanner(System.in);

    public String senha() {
        System.out.print("SENHA: ");
        String senhaa = s.nextLine();
        return senhaa;

    }

    public String cfSenha() {
        System.out.print("CONFIRME SENHA: ");
        String csenha = s.nextLine();
        return csenha;
    }

}
