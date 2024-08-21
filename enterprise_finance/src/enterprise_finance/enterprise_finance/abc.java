package enterprise_finance;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class abc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[100];
        Float[] precos = new Float[100];
        Float[] consumo_anual_unidades = new Float[100];
        Float[] valor_consumo_anuais = new Float[100];
        int contador = 0;

        float valor_acumulado_total = 0;

        System.out.println("Ferramenta ABC: Usada para determinar prioridade");
        while (true) {

            System.out.println("Digite o nome do(s) material(s) (Digite 'sair' para finalizar).");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                System.out.println("Encerrando o programa...");
                break;
            }

            System.out.println("Digite o preço do(s) produto(s):");
            Float preco = scanner.nextFloat();

            System.out.println("Digite o consumo anual da(s) unidade(s):");
            Float consumo_anual_unidade = scanner.nextFloat();

            System.out.println("Digite o valor do(s) consumo(s) anual(s):");
            Float valor_consumo_anual = scanner.nextFloat();

            nomes[contador] = nome;
            precos[contador] = preco;
            consumo_anual_unidades[contador] = consumo_anual_unidade;
            valor_consumo_anuais[contador] = valor_consumo_anual;

            valor_acumulado_total += valor_consumo_anual;
            scanner.nextLine(); 
            
            contador++;
        }

        Integer[] indices = new Integer[contador];
        for (int i = 0; i < contador; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return valor_consumo_anuais[i2].compareTo(valor_consumo_anuais[i1]);
            }
        });

        System.out.println("\nResultados:");
        for (int i = 0; i < contador; i++) {
            int index = indices[i];
            float percentual = (valor_consumo_anuais[index] * 100) / valor_acumulado_total;
            String tipo;

            if (percentual > 70) {
                tipo = "A";
            } else if (percentual > 25) {
                tipo = "B";
            } else {
                tipo = "C";
            }

            System.out.printf("Material: %s, Valor Consumo Anual: %.2f, Percentual: %.2f%%, Tipo: %s\n",
                    nomes[index], valor_consumo_anuais[index], percentual, tipo);
        }

        System.out.println("\nValor Acumulado Total: " + valor_acumulado_total);

        scanner.close();
    }
}
