package mod10;
import java.util.*;

public class MOD10 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("qual a primeira nota desejada?");
		double nota1 = sc.nextDouble();
		
		System.out.print("qual a segunda nota desejada?");
		double nota2 = sc.nextDouble();
		
		System.out.print("qual a terceira nota desejada?");
		double nota3 = sc.nextDouble();
		
		System.out.print("qual a quarta nota desejada?");
		double nota4 = sc.nextDouble();
		
		double media = ((nota1 + nota2 + nota3 + nota4) / 4);
		
		if (media >= 7) {
			System.out.println("aprovado com a nota: " + media);
		} else if (media >= 5) {
			System.out.println("Recuperação com a nota: " + media);
		} else {
			System.out.println("reprovado com a nota: " + media);
		}
	}
}
