import java.util.Scanner;

public class VerificadorExpressoes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=========================");
        System.out.print("Digite a sua expressão: ");
        System.out.println("=========================");
        String expressao = scanner.nextLine();
        
        if (StackDinamica.verificarParentesses(expressao)) {
            System.out.println("Está na ordem correta");
        } else {
            System.out.println("Está na ordem incorreta");
        }
    }
}