package prjTomadaDecisao;
import java.util.Scanner;

public class imc2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double p, a, imc;
		
		System.out.println("Digite seu peso em Kg");
		p = ler.nextDouble();
		System.out.println("Digite sua altura em M");
		a = ler.nextDouble();
		
		imc = p/(h*h);
		
		if (imc<18.5) {
			System.out.println("Excesso de magreza");
		} else { if (imc<=25) {
			System.out.println("Peso normal");
			} else { if (imc<=30) {
				System.out.println("Excesso de peso");
				} else { if (imc<=35) {
					System.out.println("Obesidade grau 1");
					} else { if (imc<=40) {
						System.out.println("Obesidade grau 2");
						} else {
							System.out.println("Obesidade grau 3");
						}
					}
				}
			}
		}
		
		ler.close();
	}

}

