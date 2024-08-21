package enterprise_finance;
import java.util.Scanner;

public class xyz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] comandos = new String[100];
        String[] respostasImprescindivel = new String[100];
        String[] respostasLinhaFrente = new String[100];
        String[] respostasSimilares = new String[100];
        String[] tiposDeProdutos = new String[100];
        int contador = 0;

        while (true) {
            System.out.println(
                    "Para começar a classificação dos produtos, digite o nome do produto (Para sair do programa, digite 'sair').");
            String comando = scanner.nextLine();

            if (comando.equalsIgnoreCase("sair")) {
                System.out.println("Encerrando o programa...");
                break;
            }

            comandos[contador] = comando;

            System.out.println("O material é imprescindível para o equipamento? (sim/não)");
            respostasImprescindivel[contador] = scanner.nextLine();

            System.out.println("O equipamento é linha de frente? (sim/não)");
            respostasLinhaFrente[contador] = scanner.nextLine();

            System.out.println("Existe produtos similares? (sim/não)");
            respostasSimilares[contador] = scanner.nextLine();

            if (respostasImprescindivel[contador].equalsIgnoreCase("sim") &&
                    respostasLinhaFrente[contador].equalsIgnoreCase("sim") &&
                    respostasSimilares[contador].equalsIgnoreCase("sim")) {

                tiposDeProdutos[contador] = "Produto é tipo Y!";

            } else if (respostasImprescindivel[contador].equalsIgnoreCase("sim") &&
                    respostasLinhaFrente[contador].equalsIgnoreCase("sim") &&
                    respostasSimilares[contador].equalsIgnoreCase("não")
                    || (respostasLinhaFrente[contador].equalsIgnoreCase("nao"))) {

                tiposDeProdutos[contador] = "Produto é tipo Z!";

            } else if (respostasImprescindivel[contador].equalsIgnoreCase("sim") &&
                    (respostasLinhaFrente[contador].equalsIgnoreCase("nao") ||
                            respostasLinhaFrente[contador].equalsIgnoreCase("não"))
                    &&
                    respostasSimilares[contador].equalsIgnoreCase("sim")) {

                tiposDeProdutos[contador] = "Produto é tipo X!";

            } else {
                tiposDeProdutos[contador] = "Produto é tipo X!";
            }

            contador++;
        }

        System.out.println("\nProdutos registrados e suas respostas:");
        for (int i = 0; i < contador; i++) {
            System.out.println("Produto: " + comandos[i]);
            System.out.println("Imprescindível para o equipamento: " + respostasImprescindivel[i]);
            System.out.println("Linha de frente: " + respostasLinhaFrente[i]);
            System.out.println("Produtos similares: " + respostasSimilares[i]);
            System.out.println("Tipo do produto: " + tiposDeProdutos[i]);
            System.out.println("-------------------------------------");
        }

        scanner.close();
    }
}
