package Hitss.Treinamento.Infra;

import java.util.Scanner;
import Hitss.Treinamento.Classe.*;
import Hitss.Treinamento.Repositorio.*;

public class Controller {
	
	public static void Play() {
		try {
			
		
		System.out.println("");
		System.out.println("     Hitss Treinamento");
		System.out.println("");
		System.out.println("-------------------------------------");
		System.out.println("(1) - Emitor o som do Cachorro.");
		System.out.println("(2) - Emitir o som do Lobo.");
		System.out.println("(3) - Emitir o som do Mamífero");
		System.out.println("-------------------------------------");
		System.out.println("");
		System.out.println("Escolha a opção desejada.");
		System.out.println("");
		Scanner teclado = new Scanner(System.in);
		int opcao = teclado.nextInt();
		
		switch (opcao) {
		case 1:
			try {
				
			
			int[] codigo = new int[5];
			codigo[1] = 1;
			codigo[2] = 2;
			codigo[3] = 3;
			codigo[4] = 4;
			
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
			
			String[] corPelo = new String[5];
			corPelo[1] = "Preto malhado Amarelo";
			corPelo[2] = "Branco";
			corPelo[3] = "Marrom";
			corPelo[4] = "Preto malhado Vermelho";
			
			System.out.println("");
			System.out.println("Digite o Código do Cachorro.");
			System.out.println("");
			int Codigo = teclado.nextInt();
			
			
			if (Codigo == codigo[Codigo]) {
				
				Cachorro cachorro = new Cachorro();
				cachorro.setPeso(peso[Codigo]);
				cachorro.setIdade(idade[Codigo]);
				cachorro.setMembros(membros[Codigo]);
				cachorro.setCorPelo(corPelo[Codigo]);
				System.out.println("");
				System.out.println("     Resultado da Busca");
				System.out.println("-----------------------------------------");
				System.out.println("Código do Cachorro: " +  codigo[Codigo]);
				System.out.println("Peso: " + cachorro.getPeso());
				System.out.println("Idade: " + cachorro.getIdade());
				System.out.println("Quantidade de Membros: " + cachorro.getMembros());
				System.out.println("Cor do Pelo: " + cachorro.getCorPelo());
				System.out.println("-----------------------------------------");
				System.out.println("");
				CachorroRepositorio rep = new CachorroRepositorio();
				rep.emitirSom();
			} else {
				System.out.println("");
				System.out.println("Nenhum(a) Cachorro(a) Encontrado(a).");
			}
			} catch (Exception e) {
				System.out.println("");
				System.out.println("Nenhum(a) Cachorro(a) Encontrado(a).");
			}
 			break;
		case 2:
			try {
				
			
			int[] codigo = new int[5];
			codigo[1] = 1;
			codigo[2] = 2;
			codigo[3] = 3;
			codigo[4] = 4;
			
			float[] peso = new float[5];
			peso[1] = 30.0f;
			peso[2] = 40.0f;
			peso[3] = 35.0f;
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
			
			String[] corPelo = new String[5];
			corPelo[1] = "Cinza";
			corPelo[2] = "Cinza";
			corPelo[3] = "Cinza";
			corPelo[4] = "Cinza";
			
			System.out.println("");
			System.out.println("Digite o Código do Lobo.");
			System.out.println("");
			int Codigo = teclado.nextInt();
			
			
			if (Codigo == codigo[Codigo]) {
				
				Lobo lobo = new Lobo();
				lobo.setPeso(peso[Codigo]);
				lobo.setIdade(idade[Codigo]);
				lobo.setMembros(membros[Codigo]);
				lobo.setCorPelo(corPelo[Codigo]);
				System.out.println("");
				System.out.println("     Resultado da Busca");
				System.out.println("-----------------------------------------");
				System.out.println("Código do Lobo: " +  codigo[Codigo]);
				System.out.println("Peso: " + lobo.getPeso());
				System.out.println("Idade: " + lobo.getIdade());
				System.out.println("Quantidade de Membros: " + lobo.getMembros());
				System.out.println("Cor do Pelo: " + lobo.getCorPelo());
				System.out.println("-----------------------------------------");
				System.out.println("");
				LoboRepositorio rep = new LoboRepositorio();
				rep.emitirSom();
			} else {
				System.out.println("");
				System.out.println("Nenhum(a) Lobo(a) Encontrado(a).");
			}
			} catch (Exception e) {
				System.out.println("");
				System.out.println("Nenhum(a) Lobo(a) Encontrado(a).");
			}
 			break;
		case 3:
			try {
				
			
			int[] codigo = new int[5];
			codigo[1] = 1;
			codigo[2] = 2;
			codigo[3] = 3;
			codigo[4] = 4;
			
			float[] peso = new float[5];
			peso[1] = 3.0f;
			peso[2] = 150.0f;
			peso[3] = 120.0f;
			peso[4] = 115.0f;
			
			int[] idade = new int[5];
			idade[1] = 3;
			idade[2] = 18;
			idade[3] = 16;
			idade[4] = 15;
			
			int[] membros = new int[5];
			membros[1] = 2;
			membros[2] = 4;
			membros[3] = 4;
			membros[4] = 4;
			
			String[] corPelo = new String[5];
			corPelo[1] = "Preto";
			corPelo[2] = "Marrom";
			corPelo[3] = "Malhada";
			corPelo[4] = "Marrom";
			
			System.out.println("");
			System.out.println("Digite o Código do Mamífero.");
			System.out.println("");
			int Codigo = teclado.nextInt();
			
			
			if (Codigo == codigo[Codigo]) {
				
				Mamifero mamifero = new Mamifero();
				mamifero.setPeso(peso[Codigo]);
				mamifero.setIdade(idade[Codigo]);
				mamifero.setMembros(membros[Codigo]);
				mamifero.setCorPelo(corPelo[Codigo]);
				System.out.println("");
				System.out.println("     Resultado da Busca");
				System.out.println("-----------------------------------------");
				System.out.println("Código do Mamífero: " +  codigo[Codigo]);
				System.out.println("Peso: " + mamifero.getPeso());
				System.out.println("Idade: " + mamifero.getIdade());
				System.out.println("Quantidade de Membros: " + mamifero.getMembros());
				System.out.println("Cor do Pelo: " + mamifero.getCorPelo());
				System.out.println("-----------------------------------------");
				System.out.println("");
				MamiferoRepositorio rep = new MamiferoRepositorio();
				rep.emitirSom();
			} else {
				System.out.println("");
				System.out.println("Nenhum(a) Mamífero(a) Encontrado(a).");
			}
			} catch (Exception e) {
				System.out.println("");
				System.out.println("Nenhum(a) Mamífero(a) Encontrado(a).");
			}
 			break;
		default:
			System.out.println("");
			System.out.println("Opção inválida");
			break;
		}
		} catch (Exception e) {
			System.out.println("");
			System.out.println("Opção inválida");
		}
	}

}
