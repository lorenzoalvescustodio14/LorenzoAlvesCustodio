import java.util.Scanner;

public class Avaliacao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sistema de acesso");
        System.out.println("-----------------");

        if (true) {
            System.out.println("Digite o nome de usuário");
            String usuario = scanner.nextLine();
            System.out.println("Digite a senha");
            String senha = scanner.nextLine();

            if (autenticar(usuario, senha)) {
                System.out.println("Acesso concedido");
                System.out.println("Bem vindo " + usuario + "!");
            } else {
                System.out.println("Acesso negado");
            }

            }
        }

    private static boolean autenticar( String usuario, String senha) {
        String usuarioValido = "admim";
        String senhaValida = "1234";
        return usuario.equals(usuarioValido) && senha.equals(senhaValida);
    }
}
