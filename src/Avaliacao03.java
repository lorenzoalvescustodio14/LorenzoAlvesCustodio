import java.util.Scanner;

public class Avaliacao03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Você é estudante, Digite 1 se sim");
        String estudante = scanner.nextLine();

        if ((idade < 6) || (idade > 65)) {
            System.out.println("Valor a pagar: R$ 0");
        } else if ((idade >= 6) && (idade <= 25) && estudante.equals("S")){
            System.out.println("Valor a pagar: R$ 2");
        } else{
            System.out.println("Valor a pagar: R$ 4");
        }
    }
}

