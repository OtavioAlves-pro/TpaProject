
import java.util.Scanner;

public class Tabuada2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM = 5;
		int a[], i, j;
		a = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			
			System.out.println("digite o "+(i+1)+"° numero ");
			a[i] = ler.nextInt();
			
		}
		
		for(i=0; i<TAM; i++) {
			for(j=0; j<11; j++) {
				System.out.println(a[i]+"x"+j+"="+a[i]*j);
				
			}
			
		}
		
		ler.close();
		
	}

}


