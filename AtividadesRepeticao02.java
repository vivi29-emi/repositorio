/*Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*\
 * 
 */
package br.com.generationrepeticao;

public class AtividadesRepeticao02 {

	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 10; i++) {

			if (i % 2 == 0) {
				System.out.println("O numero � par:" + i);
			} else if (i % 2 != 0) {
				System.out.println("o numero � impar" + i);
			}
			Thread.sleep(1000);
		}
	}

}
