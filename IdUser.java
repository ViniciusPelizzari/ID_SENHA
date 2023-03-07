import java.util.Scanner;

public class IdUser {
    Scanner s = new Scanner(System.in);

    public String use() {
        System.out.print("USUÁRIO: ");
        String usua = s.nextLine();
        return usua;
    }

    public String user() {
        System.out.print("CONFIRME USUÁRIO: ");
        String usuar = s.nextLine();
        return usuar;
    }
}
