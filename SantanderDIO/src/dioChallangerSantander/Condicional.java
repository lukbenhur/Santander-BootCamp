package dioChallangerSantander;

public class Condicional {
	public static void main(String[] args) {
		/*
		 * Estruturas condicionais (If / Else)
		 * realiza o controle de fluxo de um codigo
		 * pode ser simple, composta ou encadeada;
		 */
		//estrutura de condição encadeada, a condiçao devera retornar true ou false
		
		int notaAluno = 3;
		
		if(notaAluno >= 7 && notaAluno <= 10) {
			System.out.println("aprovado");
		}else if(notaAluno >= 4) {
			System.out.println("aluno esta de recuperação");
		}else {
			System.out.println("aluno reprovado");
		}
		
		//usando switch
		//os parametros devem ser exatos int ou string
		
		switch(notaAluno) {
		case 10:
		case 9:
		case 8:
		case 7:{
			System.out.println("aluno aprovado");
			break;
		}
		case 6:
		case 5:
		case 4:{
			System.out.println("aluno de recuperação");
			break;
		}
		case 3:
		case 2:
		case 1:
		case 0:{
			System.out.println("aluno reprovado");
			break;
		}
		default:{
			System.out.println("digite um numero valido");
		}
		}
	}
}
