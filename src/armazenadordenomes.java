import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;

public class armazenadordenomes {
    public static void main(String[] args) {
        System.out.println("###################################################");
        System.out.println("Bem-vindo ao armazenador de nomes do banco de dados");
        System.out.println("###################################################\n");

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

        System.out.println("Nomes armazenados: " + list);
    }



    }

