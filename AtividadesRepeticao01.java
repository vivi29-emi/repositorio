
/*Informar todos os números de 1000 a 1999 que quando divididos por 11
	obtemos resto = 5. for*/

package br.com.generationrepeticao;

public class AtividadesRepeticao01 {

	public static void main(String[] args) throws InterruptedException {

		for (int i = 1000, n = 11; i <1999; i++) {
			//System.out.println("Valor " + i);

			if (i % n == 5) {
				System.out.println("O resto de 5=" + i);

				Thread.sleep(1000);
			}

		}

	}

}

