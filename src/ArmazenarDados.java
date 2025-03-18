import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ArmazenarDados {
    public static void main(String[] args) {
        System.out.println("################################");
        System.out.println("Bem-vindo ao banco de dados Java");
        System.out.println("################################\n");

        Scanner scanner = new Scanner(System.in);

        LinkedList<String> list = new LinkedList<>();
        System.out.println("Digite os nomes que deseja guardar (digite 'exit' para finalizar): ");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            list.add(input);
        }

        LinkedList<String> listAge = new LinkedList<>();
        System.out.print("Digite as idades que deseja armazenar (ou 'exit' para sair): ");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                int age = Integer.parseInt(input);
                listAge.add(String.valueOf(age));
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número ou 'exit' para sair.");
            }
        }

        ArrayList<String> planos = new ArrayList<>();
        planos.add("Plano Básico: Acesso essencial: 5 saques, 10 transferências e 3 extratos mensais.");
        planos.add("Plano Intermediário: Mais flexibilidade: 15 saques, 30 transferências e 10 extratos mensais.");
        planos.add("Plano Premium: Acesso ilimitado: saques e transferências ilimitadas, 30 extratos mensais e suporte prioritário.");

        String planoEscolhido = null;
        while (true) {
            System.out.println("Escolha um plano que deseja para sua conta (ou 'exit' para sair): ");
            for (int i = 0; i < planos.size(); i++) {
                System.out.println((i + 1) + ". " + planos.get(i));
            }

            String escolha = scanner.nextLine();
            if (escolha.equalsIgnoreCase("exit")) {
                System.out.println("Saindo...");
                break;
            }

            try {
                int indiceEscolha = Integer.parseInt(escolha) - 1;
                if (indiceEscolha >= 0 && indiceEscolha < planos.size()) {
                    planoEscolhido = planos.get(indiceEscolha);
                    System.out.println("Você escolheu o " + planoEscolhido);
                    break;
                } else {
                    System.out.println("Opção inválida, tente novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, escolha um número válido.");
            }
        }

        System.out.println("\nOs nomes, idades e plano armazenados são:");
        System.out.println("Nomes: " + list);
        System.out.println("Idades: " + listAge);
        System.out.println("Plano escolhido: " + planoEscolhido);

        scanner.close();
    }
}
