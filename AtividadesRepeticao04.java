package br.com.generationrepeticao;

import java.util.Scanner;

public class AtividadesRepeticao04 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException {
		int pessoas = 0, idade = 0, sexo = 0, persona = 0, pessoasCalmas = 0, mulheresNervosas = 0,
				homensAgressivos = 0, outrosCal = 0, nervosas40Anos = 0, cal18Anos = 0;
		int ferminino = 1, masculino = 2, outros = 3;
		int calmos = 4, nervosas = 5, agressivo = 6;

		for(pessoas= 0; pessoas<=3; pessoas++) {

			System.out.println("informe sua idade:");
			idade = leia.nextInt();
			System.out.println("De 1 á 3 informe seu sexo sendo 1 ferminino,2 masculino ou 3 outros?");
			sexo = leia.nextInt();
			System.out.println("Sua personalidade é de 4 á 6 sendo 4 calma, 5 nervosa ou 6 agressivo?");
			persona = leia.nextInt();

			if (persona == sexo) {
				

				if (outros == calmos) {
					outrosCal++;

				}
				if(persona == calmos) {
					pessoasCalmas++;
				}
			}

			if (sexo == persona) {

				if (ferminino == nervosas) {
					mulheresNervosas++;

					if (masculino == agressivo) {

						homensAgressivos++;

					}

				}
			}

			if (idade == persona) {
				if (idade > 40 && idade== nervosas) {
					nervosas40Anos++;

					if (idade < 18 && idade==calmos) {

						cal18Anos++;
					}

				}

			}
		}
		
		System.out.println("o número de pessoas calmas:" + pessoasCalmas);
		System.out.println("o número de mulheres calmas" + mulheresNervosas);
		System.out.println("o número de homens agressivos" + homensAgressivos);
		System.out.println("o número de outros calmos" + outrosCal);
		System.out.println("o número de pessoas nervosas com mais de 40 anos" + nervosas40Anos);
		System.out.println("o número de pessoas calmas com menos de 18 anos." + cal18Anos);
		leia.close();
	}

}
