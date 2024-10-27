package soma;

public class Somatoria {

	public static void main(String[] args) {
		int indice = 12;
		int soma = 0;
		int k = 1;
		
		do {
			k++;
			soma = soma + k;
			System.out.println(soma);
		} while (k < indice);		
		
		System.out.println("total " + soma);

	}

}
