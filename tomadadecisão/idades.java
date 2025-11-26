package prjAula003;
import java.util.Scanner;

public class idades {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	
		int anoAtual, anoNasc, idade;
		
		System.out.println("Digite o ano atual:");
		anoAtual = ler.nextInt();
		
	    System.out.println("Digite o ano de nascimento");
	    anoNasc = ler.nextInt();
	
	    idade= anoAtual-anoNasc; 
	    
	    System.out.println("Sua idade é "+idade);
	    
	    if (idade<10) {
	    System.out.println("Voce e criança");
	    }
	    
	    else if (idade<18) {
	    System.out.println("Você é adolecente");
	    }
	    
	    else if (idade<60) {
	    	System.out.println("Você é adulto");
	    }
	    
	    else {
	    	System.out.println("Você é idoso");
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    }
	
	    
	}

