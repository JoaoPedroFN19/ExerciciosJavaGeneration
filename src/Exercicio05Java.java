import java.util.Scanner;

public class Exercicio05Java {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double nota1, nota2, nota3, media;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = leia.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		nota2 = leia.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		nota3 = leia.nextDouble();
		
		media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
		
		System.out.println("M?dia Final: " + media);
		
		leia.close();
	}

}
