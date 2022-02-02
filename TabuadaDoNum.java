import java.util.Scanner;

public class TabuadaDoNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ct = 1, num, resultado;

		System.out.println("Digite um número inteiro: ");
		num = sc.nextInt();

		System.out.println("===== Tabuada do " + num + " =====");

		while (ct <= 10) {
			resultado = num * ct;
			System.out.println(num + " x " + ct + " = " + resultado);
			ct++;
		}
		System.out.println("===== Fim do programa =====");
		sc.close();
	}
}