import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;

public class armazenadordenomes {
    public static void main(String[] args) {
        System.out.println("################################");
        System.out.println("Bem-vindo ao banco de dados java");
        System.out.println("################################\n");

        Scanner scanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        System.out.println("Digite os nomes que dejesa guardar (digite 'exit' para finalizar): ");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            list.add(input);
        }

        Scanner number = new Scanner(System.in);
        LinkedList<String> listage= new LinkedList<>();

        System.out.print("Digite as idades que deseja armazenar (ou 'exit' para sair): ");
        while (true) {
            String input = number.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                int age = Integer.parseInt(input);
                listage.add(String.valueOf(age));
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número ou 'exit' para sair.");
            }
        }

        System.out.println("Os nomes e idades armazenados são nomes: " + list
        + " idades: " + listage);
    }


}





