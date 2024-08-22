package payback;

import java.util.*;
import javax.swing.*;
public class payback {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double valor [] = new double[10];
		double somaSaldo = 0;
		
		for(int i = 0; i < 10; i++) {
		System.out.println("Digite o "+ (i + 1) +"ª saldo:");
		double saldo = scan.nextDouble();
		somaSaldo += saldo;
		valor[i] = saldo;
		}

		double mediaSaldo = somaSaldo / 10;
		System.out.println("Digite o valor investido:");
		double valorInvestido = scan.nextDouble();
		double valorFinal = valorInvestido / mediaSaldo;
		System.out.println(valorFinal);
	}

}
