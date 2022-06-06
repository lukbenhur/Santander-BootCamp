package dioChallangerSantander;

public class Repeticao {
	public static void main(String[] args) {
		
		/*
		 * tipos de estruturas de repetição
		 
			for (int i = 0; i < condition; i++) {
				
			}
			while (condition) {
				
			}
			
			do {
				
			} while (condition);
		*/
		
		boolean grama = true;
		
		while(grama == true) {
			boolean cortarGrama = true;
			grama = cortarGrama;
			grama = false;
		}
		System.out.println("a grama esta cortada " + grama);
	}
}
