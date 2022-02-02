import java.util.Scanner;

public class DescontoINSS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cs = 1;
		double si, sf;

		while (cs <= 4) {
			System.out.println("Digite o valor do seu salário:");
			si = sc.nextDouble();
			if (si < 2000) {
				sf = (si * 8.5) / 100;
				System.out.println("O valor do seu salário com o desconto do INSS é de: " + sf);
			} else if (si > 2000) {
				sf = (si * 11) / 100;
				System.out.println("O valor do seu salário com o desconto do INSS é de: " + sf);
			}
			cs++;
		}
		System.out.println("========== Fim do programa ==========");
		sc.close();
	}
}