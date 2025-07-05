import java.util.Scanner;

public class Avaliacao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua nota");
        int nota = scanner.nextInt();
        
        if ((nota <= 100) && (nota >= 90)) {
            System.out.println("Sua nota é A");
        } else if ((nota <= 89) && (nota >= 80)) {
            System.out.println("Sua nota é B");
        } else if ((nota <= 79) && (nota >= 70)) {
            System.out.println("Sua nota é C");
        } else if ((nota <= 69) && (nota >= 60)) {
            System.out.println("Sua nota é D");
        } else if (nota < 60) {
            System.out.println("Sua nota é F");
        }
    }
}
