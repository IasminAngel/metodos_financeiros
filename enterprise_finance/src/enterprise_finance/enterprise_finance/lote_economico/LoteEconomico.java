import java.util.Scanner;

public class LoteEconomico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resposta;
        double ca = 0;
        double cc = 0;
        double cpa = 0;
        double pu = 0;
        double a = 0;
        double b = 0; 
        double c = 0;
        double d = 0; 
        double e = 0; 
        double f = 0;

        do {

            System.out.println("Lote econômico:");
            System.out.print("Digite: Consumo Anual (CA): ");
            ca = scanner.nextDouble();
    
            System.out.print("Digite: Custo do pedido de compra (CC): ");
            cc = scanner.nextDouble();
    
            System.out.print("Digite: Material armazenado (CPA): ");
            cpa = scanner.nextDouble();
    
            System.out.print("Digite: Preço Unitário do material (PU): ");
            pu = scanner.nextDouble();
    
            System.out.print("Digite: Quantidade pedida (A): ");
            a = scanner.nextDouble();

            scanner.nextLine();
    
            double lec = Math.sqrt((2 * ca * cc) / (cpa * pu));

            b = ca / a;
            c = (a / 2) * pu;
            d = cpa * c;
            e = cc * b;
            f = d + e;

    
            System.out.println("Resultado - LEC: " + lec);
            System.out.println("Resultado - Pedidos Anuais (B): " + b);
            System.out.println("Resultado - Estoque médio (C): " + c);
            System.out.println("Resultado - Custo de posse (D): " + d);
            System.out.println("Resultado - Custo do Pedido (E): " + e);
            System.out.println("Resultado - Custo Total (F): " + f);
    
            System.out.print("Deseja adicionar mais um lote? (sim/não): ");
            resposta = scanner.nextLine();
            
        } while (resposta.equalsIgnoreCase("sim"));


        scanner.close();
    }
}
