/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*\
 * 
 */
package br.com.generationrepeticao;

public class AtividadesRepeticao02 {

	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 10; i++) {

			if (i % 2 == 0) {
				System.out.println("O numero é par:" + i);
			} else if (i % 2 != 0) {
				System.out.println("o numero é impar" + i);
			}
			Thread.sleep(1000);
		}
	}

}
