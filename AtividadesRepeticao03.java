
package br.com.generationrepeticao;

import java.util.Scanner;

public class AtividadesRepeticao03 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException {
		int idade = 0;
				
		
		while (idade<=0) {
			
			System.out.println("informar sua idade:");
			idade = leia.nextInt();

	
			
			if (idade <= 21 && idade<=99) {
				System.out.println("Total de pessoas com menos de 21:" + idade);
			} else if (idade >50 && idade<99) {

				System.out.println("Total de pessoas com mais de 50:" + idade);
			}
			else if (idade>=99) {
				System.out.println("Fim do programa");
			}
		}
		Thread.sleep(1000);
	}

}
