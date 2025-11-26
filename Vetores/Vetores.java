import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner in = new Scanner (System.in);
      final int TAM=10;
      int a[], b[], i;
      a = new int [TAM];
      b = new int [TAM];     
     
      
      for(i=0; i<TAM; i++) {
    	  System.out.println("Digite o"+(i+1)+"Valor do vetor A");
    	  a[i] = in.nextInt();
      
    	  b[i] = a[i]*a[i];
      }  
    	for(i=0; i<TAM; i++) {
    		System.out.println("Valor do vetor b o"+(i+1)+ b[i]);
    	}
    	  
      }
	
}

