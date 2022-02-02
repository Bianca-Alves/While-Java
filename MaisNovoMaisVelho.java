import java.util.Scanner;

public class MaisNovoMaisVelho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		String nomeNovo = "";
		String nomeVelho = "";
		int idade;
		int idadeNovo = 999999999;
		int idadeVelho = -1;
		int cont = 1;

		while (cont <= 10) {
			System.out.println("===== " + cont + "° PESSOA =====");
			System.out.print("Digite seu nome: ");
			nome = sc.next();

			System.out.print("Digite sua idade: ");
			idade = sc.nextInt();

			if (cont == 1) {
				nomeNovo = nome;
				nomeVelho = nome;
				idadeNovo = idade;
				idadeVelho = idade;

			} else if (idade < idadeNovo) {
				idadeNovo = idade;
				nomeNovo = nome;

			} else if (idade > idadeVelho) {
				idadeVelho = idade;
				nomeVelho = nome;
			}
			cont++;
		}
		System.out.println("O mais novo é " + nomeNovo + ", com " + idadeNovo + " anos.");
		System.out.println("O mais velho é " + nomeVelho + ", com " + idadeVelho + " anos.");
		sc.close();
	}
}