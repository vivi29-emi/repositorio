package br.com.generationrepeticao;

public class AtividadesRepeticao05 {

	public static void main(String[] args) {
		public static void main(String[] args) {
	        //Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
	        //No final, mostre a soma dos números digitados.

	        Scanner entrada = new Scanner(System.in);

	        int numero, resultado = 0;

	        do{
	            System.out.println("Digite um número: ");
	            numero = entrada.nextInt();
	            resultado += numero;
	        }while(numero != 0);

	        System.out.println("A soma dos números digitados é: " + resultado);

	        entrada.close();

	    }

	}

	}


