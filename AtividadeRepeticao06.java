package br.com.generationrepeticao;

public class AtividadeRepeticao06 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	int i = 0, numero, soma = 0;
	double media = 0.0;
	
	do {
		System.out.println("DIGITE UM N�MERO: ");
		numero = (int) entrada.nextDouble();
		
		if(numero % 3 == 0 && numero != 0) {
			soma = soma + numero;
			i++;				
		}
	}while(numero != 0);
	media = soma / i;
	System.out.println("Impress�o da M�dia: " + media);
	
}
}
