package Hitss.Treinamento.Infra;

import java.util.Scanner;

public class Controller {
	
	public static void Play() {
		System.out.println("");
		System.out.println("     Hitss Treinamento");
		System.out.println("");
		System.out.println("-------------------------------------");
		System.out.println("(1) - Emitor o som do Cachorro.");
		System.out.println("(2) - Emitir o som do Lobo.");
		System.out.println("(3) - Emitir o som do Mamífero");
		System.out.println("-------------------------------------");
		System.out.println("");
		System.out.println("Prezado(a) Usuário(a), Estamos em Desenvolvimento no Momento.");
		System.out.println("");
		System.out.println("Escolha a opção desejada.");
		System.out.println("");
		Scanner teclado = new Scanner(System.in);
		int opcao = teclado.nextInt();
		
		switch (opcao) {
		case 1:
			float[] peso = new float[5];
			peso[1] = 10.0f;
			peso[2] = 7.0f;
			peso[3] = 40.0f;
			peso[4] = 35.0f;
			
			int[] idade = new int[5];
			idade[1] = 7;
			idade[2] = 4;
			idade[3] = 8;
			idade[4] = 4;
			
			int[] membros = new int[5];
			membros[1] = 4;
			membros[2] = 4;
			membros[3] = 4;
			membros[4] = 4;
 			break;

		default:
			break;
		}
	}

}
