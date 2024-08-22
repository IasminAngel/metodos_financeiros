package enterprise_finance;

import java.util.Scanner;

public class FluxoCaixa_new {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Float[] previsto = new Float[100];
        Float[] realizado = new Float[100];
        Float[] perdas = new Float[100];
        String[] nomePerda = new String[100];
        float somaSaldo = 0;
        float totalPerdas = 0;
        float finalizacao = 0;

        System.out.println("Quantia de previsões:");
        int numPrevisoes = scanner.nextInt();

        System.out.println("Quantia de recebimento previsto por previsão:");
        int numRecebimentoPrevisto = scanner.nextInt();

        System.out.println("Quantia de realizações:");
        int numRealizacoes = scanner.nextInt();

        System.out.println("Quantia de recebimento por realização:");
        int numRecebimentoRealizado = scanner.nextInt();

        System.out.println("Quantia de perdas:");
        int numPerdas = scanner.nextInt();

        scanner.nextLine(); 

        for (int i = 0; i < numPrevisoes; i++) {
            float totalRecebimentoPrevisto = 0;
            for (int y = 0; y < numRecebimentoPrevisto; y++) {
                System.out.println("Previsão " + (i + 1) + ", recebimento previsto " + (y + 1) + ":");
                totalRecebimentoPrevisto += scanner.nextFloat();
            }
            previsto[i] = totalRecebimentoPrevisto;
        }

        scanner.nextLine();

        for (int i = 0; i < numRealizacoes; i++) {
            float totalRecebimentoRealizado = 0;
            for (int y = 0; y < numRecebimentoRealizado; y++) {
                System.out.println("Realização " + (i + 1) + ", recebimento realizado " + (y + 1) + ":");
                totalRecebimentoRealizado += scanner.nextFloat();
            }
            realizado[i] = totalRecebimentoRealizado;
            somaSaldo += totalRecebimentoRealizado;
        }

        scanner.nextLine(); 

        
        for (int y = 0; y < numPerdas; y++) {
            System.out.println("Digite o nome da perda - " + (y + 1) + ":");
            nomePerda[y] = scanner.nextLine();
             
            System.out.println("Digite o valor da perda - " + (y + 1) + ":");
            perdas[y] = scanner.nextFloat();
            totalPerdas += perdas[y];
            scanner.nextLine(); 
        }

        finalizacao = somaSaldo - totalPerdas;

        System.out.println("\nPrevisões, Realizações e Perdas:");
        for (int i = 0; i < numPrevisoes; i++) {
            String previsaoStr = (i < numPrevisoes) ? previsto[i].toString() : "N/A";
            String realizacaoStr = (i < numRealizacoes) ? realizado[i].toString() : "N/A";
            System.out.println("Previsão- " + (i+1) + ": " + previsaoStr + ", Realização- " + (i+1) + ": " + realizacaoStr);
        }

        System.out.println("\nSoma das Realizações: " + somaSaldo);
        System.out.println("\nTotal de perdas: " + totalPerdas);
        System.out.println("\nResultado Final: " + finalizacao);

        for(int i = 0; i < numPerdas; i++){
        System.out.println("\nNome: " + nomePerda[i] + " Valor da perda: " + perdas[i]);
        }

        scanner.close();
    }
}
