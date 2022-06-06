package dioChallangerSantander;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * fazer um programa de adivinha onde vou gerar um numero aleatorio e com estruturas de fluxo
 * criar dicas para facilitar ao usuario descobrir o numero sorteado.
 * ao final guardas os numeros escolhidos pelo usuario em um Array e dizer as opçoes escolhidas;;
 */
public class Exemplo {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		int numeroEscolhido,palpite,tentativas = 0;
		numeroEscolhido = (int)(Math.random()*100);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		System.out.println("Escolha um numero:");
		palpite = dado.nextInt();
		do {
			if(palpite == numeroEscolhido) {
				System.out.println("Parabéns você acertou, o número escolhido é: " + palpite);
				tentativas ++;
				numeros.add(palpite);
			}else if(numeroEscolhido <= 50 ){
				System.out.println("O numero escolhido esta entre 1 e 50");
				numeros.add(palpite);
				tentativas++;
				System.out.println("Tente novamente");
				palpite = dado.nextInt();
				tentativas++;
				numeros.add(palpite);
			}else {
				System.out.println("O numero escolhido esta entre 51 e 100");
				numeros.add(palpite);
				tentativas++;
				System.out.println("Tente novamente");
				palpite = dado.nextInt();
				tentativas++;
				numeros.add(palpite);
			}
		}while(palpite != numeroEscolhido);
		
		System.out.printf("Parabens voce acertou o numero escolhido %d com %d tentativas%n",numeroEscolhido,tentativas);
		for (Integer varrer : numeros) {
			
			System.out.println("os numeros escolhidos foram" + varrer);
		}
		dado.close();
		
	}
}
