package br.com.generationrepeticao;

public class AtividadesRepeticao05 {

	public static void main(String[] args) {
		public static void main(String[] args) {
	        //Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
	        //No final, mostre a soma dos n�meros digitados.

	        Scanner entrada = new Scanner(System.in);

	        int numero, resultado = 0;

	        do{
	            System.out.println("Digite um n�mero: ");
	            numero = entrada.nextInt();
	            resultado += numero;
	        }while(numero != 0);

	        System.out.println("A soma dos n�meros digitados �: " + resultado);

	        entrada.close();

	    }

	}

	}


