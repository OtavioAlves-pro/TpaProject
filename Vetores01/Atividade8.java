
import java.util.Scanner;

public class Elementosfat {
	
		public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);
			
	        final int TAM=10;
	        int a[], b[],  i, j, soma = 0;
			
	        a = new int [TAM];
	        b = new int [TAM];
	        System.out.println("Digite 10 elementos inteiros do vetor A:");
	        for ( i = 0; i < TAM; i++) {
	            a[i] = ler.nextInt();
	        }
	       

	        for ( i = 0; i < TAM; i++) {
	            for ( j = i; j < TAM; j++) {
	                soma += a[j];
	            }
	            b[i] = soma;
	        }
			
	        System.out.println("Vetor A:");
	        for ( i = 0; i < TAM; i++) {
	            System.out.print(a[i] + " ");
	        }
			
	        System.out.println("\n\Vetor B (soma):");
	        for ( i = 0; i < TAM; i++) {
	            System.out.println("B[" + i + "] = " + b[i]);
	        }
	    }
	}





