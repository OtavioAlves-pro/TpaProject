import java.util.Scanner;

public class VetorLetras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner in = new Scanner (System.in);
     final int TAM=5;
     int a[], b[], c[], i;
     a = new int [TAM];
     b = new int [TAM];
     c = new int [TAM];
     
     System.out.println();
     for(i=0; i<TAM; i++) {
   	  System.out.println("Digite o"+(i+1)+"Valor do vetor A");
   	  a[i] = in.nextInt();
   	  
     }
     for(i=0; i<TAM; i++) {
    	 System.out.println("Digite o"+(i+1)+"Valor do vetor B");
    	 b[i] = in.nextInt();
    	 
    	 c[i] = a[i]+b[i];
    	 }
     System.out.print("A = ["); 
     for(i=0; i<TAM; i++) {
  	   System.out.print(a[i]+" ");
     }
      
     System.out.print("]"); 
     System.out.print("B = ["); 
     for(i=0; i<TAM; i++) {
  	   System.out.print(b[i]+" ");
     }
      
     System.out.print("]"); 
       System.out.print("C = ["); 
       for(i=0; i<TAM; i++) {
    	   System.out.print(c[i]+" ");
       }
        
       System.out.print("]"); 
	}

}
