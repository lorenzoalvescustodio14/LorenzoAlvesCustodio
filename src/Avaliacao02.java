import java.util.Scanner;

public class Avaliacao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual valor você deseja pegar emprestado");
        double emprestimo = scanner.nextDouble();

        System.out.println("Em quantas parcelas você deseja pagar (entre 1 e 24)");
        int parcela = scanner.nextInt();

        System.out.println("Qual seu salário mensal");
        double salario = scanner.nextDouble();

        double valorParcela = (emprestimo / parcela);

        if ((parcela < 1) || (parcela > 24)) {
            System.out.println("Empréstimo reprovado, número de parcelas inválida");
        } else if (valorParcela > salario) {
            System.out.println("Empréstimo reprovado, parcela muito alta");
        } else if ((parcela >= 1) && (parcela <= 24)) {
            System.out.println("Empréstimo aprovado, o valor de cada parcela é: " + valorParcela);
        }
    }
}

