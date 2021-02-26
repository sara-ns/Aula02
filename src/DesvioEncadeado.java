import java.util.Scanner;

public class DesvioEncadeado {

	public static void main(String[] args) {
		/*Uma ONG resolveu prestar um servi�o bem diferente: ela oferece vans para buscar pessoas com qualquer tipo de dificuldade de locomo��o para poderem votar.
		 * Para evitar problemas no momento do embarque, por�m, voc� foi convidado a criar um programa que valide a idade dos passageiros: caso tenham 16 anos ou menos, n�o podem votar (e nem embarcar). Caso tenham entre 16 anos e 18 incompletos, podem optar por votar ou n�o. Caso tenham mais de 18 anos, devem votar obrigatoriamente.
		 * Crie um programa que receba a idade dos passageiros em potencial e indique se podem embarcar e votar.*/
		
		Scanner leitor = new Scanner(System.in);
		int idade;
		System.out.println("Por favor, digite a idade do passageiro.");
		idade = leitor.nextInt();
	
		/*Aqui devemos criar uma solu��o para realizar as verifica��es.*/
		
		/*if (idade <16) {
			System.out.println("Essa pessoa não pode votar e não pode embacar embarcar! ");
	
		}else {
			if (idade <18) {
				System.out.println("Tanto a votação quanto o embarque são opcionais para essa pessoa! ");
			
			}else {
				System.out.println("Essa pessoa é obrigada a votar!");
			}
		}*/
		
		if (idade <=16) {
			System.out.println("Essa pessoa não pode votar e não pode embarcar");
		}else if (idade < 18) {
			System.out.println("Tanto a votação quanto o embarque são opcionais");
		}else {
			System.out.println("Essa pessoa é obrigada a votar!");	
		}
		
		
	
		leitor.close();

	}

}
