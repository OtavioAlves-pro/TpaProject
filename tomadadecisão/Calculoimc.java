package prjAula002;
import java.util.Scanner;

public class Calculoimc {

public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);
	double peso, altura, imc;
	
	System.out.println("quantidade de peso");
	peso = ler.nextDouble();
	
	System.out.println("valor da altura");
	altura = ler.nextDouble();
	
	imc=peso/altura*altura;
	
	System.out.println("Valor do" +imc);
}
}
