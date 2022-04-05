package br.com.generationrepeticao;

import java.util.Scanner;

public class Exercicio04While {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int idade=0,cont=0,sexo=0;
		char psico;
		int contcalmo= 0,contnervoso=0,contagressivo=0,contnervoso40 = 0,contcalmo18 = 0,contnervosof =0,contagressivom=0,outroscalmos=0;
		while(cont<5){
			System.out.println("Digite a idade: ");
			idade = input.nextInt();
			System.out.println("Digite o Estado mental. (C)almo/(N)ervoso/(A)gressivo. ");
			psico = input.next().charAt(0);
			System.out.println("Digite o seu Sexo: 1-Masculino/2-Feminino/3-Outros");
			sexo = input.nextInt();
			
			if(psico == 'c') {
					contcalmo++;
					if(sexo == 3){
						outroscalmos++;
					}
					if(idade <=18){
						contcalmo18++;
					} 
				}
				if(psico == 'n') {
					contnervoso++;
						if(sexo == 2){
								contnervosof++;
						}
						if(idade>=40) {
							contnervoso40++;
						}
						}
				if (psico == 'a' ) {
					contagressivo++;
					if(sexo == 1) {
							contagressivom++;
						}
					}
				
cont+=1;}
		input.close();
		System.out.println("A quantidade de pessoas calmas é: " + contcalmo);//numero de pessoas calmas
		System.out.println("A quantidade de mulheres nervosas é: " + contnervosof);//numero de mulheres nervosas
		System.out.println("O numero de homens agressivos é: "+contagressivom);//numero de homens agressivos
		System.out.println("O numero de outros calmos é: " + outroscalmos);//numero de outros calmos
		System.out.println("A quantidade de pessoas nervosas maiores ou igual a 40 anos é: " + contnervoso40);//numero de pessoas nervosas+40
		System.out.println("A quantidade de pessoas calmas menores ou igual a 18 anos é: " + contcalmo18);//numero de pessoas calmas -18
		
		
		input.close();
	}

}
