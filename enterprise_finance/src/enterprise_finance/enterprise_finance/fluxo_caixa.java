package enterprise_finance;
import java.util.Scanner;

public class fluxo_caixa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Float[] previsto = new Float[100];
        Float[] realizado = new Float[100];
        Float[] perdas = new Float[100];
        int contador = 0;
        float somatotal = 0;
        float totalPerdas = 0;
        float finalizacao = 0;
        float totalPrevisoes = 0;
        float payback = 0;

        while (true) {
            System.out.println("Adicione previsões (Digite um valor negativo para encerrar):");
            Float previsao = scanner.nextFloat();

            System.out.println("Adicione realizações (Digite um valor negativo para encerrar):");
            Float realizacao = scanner.nextFloat();

            if (previsao < 0 || realizacao < 0) {
                System.out.println("Encerrando o programa...");
                break;
            }

            previsto[contador] = previsao;
            realizado[contador] = realizacao;
            somatotal += realizacao;
            totalPrevisoes += previsao;
            
            System.out.println("Adicione as perdas (Se não houver, digite 0):");
            Float perda = scanner.nextFloat();
            perdas[contador] = perda;
            totalPerdas += perda;

            contador++;
        }

        finalizacao = somatotal - totalPerdas;

        if (contador > 0) {
            payback = totalPrevisoes / somatotal;
        }

        System.out.println("\nPrevisões, Realizações e Perdas:");
        for (int i = 0; i < contador; i++) {
            System.out.println("Previsão: " + previsto[i] + ", Realização: " + realizado[i] + ", Perda: " + perdas[i]);
        }

        System.out.println("\nSoma das Realizações: " + somatotal);
        System.out.println("\nTotal de perdas: " + totalPerdas);
        System.out.println("\nResultado Final: " + finalizacao);
        System.out.println("\nPayBack: " + payback);

        scanner.close();
    }
}
