import java.util.Scanner;

public class Ex6Metodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int alunos;
		int x = 0;
		int s;
		double media = 0,c = 0, contafinal;
		
		System.out.println("Quantas salas existem?");
		s = teclado.nextInt();

		int[] salas = new int[s];

		for (int i = 0; i < salas.length; i++) {

			System.out.println("Quantos alunos tem na " + (i + 1) + "° sala?");
			alunos = teclado.nextInt();

			double[] notas = new double[alunos];
			
			media = contnotas(notas,media,i);
			
			media = media/alunos;
			
			System.out.println("A média da sala é de: " + media);
		
			
			c = contporcentagem(notas,c,media);
			
		media = 0;
		
		contafinal = c/alunos * 100;
			
		c = 0;
		System.out.println("A porcentagem de alunos acima da média é de: " + String.format("%.3f", contafinal) + "%");
		}

	}

	 public static double contnotas(double notas[], double media, int i) {
		 Scanner teclado = new Scanner(System.in);
		 
		 for (int j = 0; j < notas.length; j++) {
				System.out.println("Qual a nota do " + (j +1) + "° aluno? Atribua um valor de 0 a 100 ");
				notas[j]= teclado.nextDouble();
				
				media += notas[j];
	 }
		 return media;
}

	 public static double contporcentagem(double notas[], double media, double c) {
		 
		 for (int j = 0; j < notas.length; j++) {
				if(notas[j] > media) {
					
					c++;
				}
			}
		 return c;
	 }
	 
	 
	 
}