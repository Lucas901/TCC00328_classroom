package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio15;

public class LucasAguiarTostes {
	
	
	public static void main(String[] args) {
		float numeros[] = {3.2f, 4, 4.7f, 5.1f, 5.3f, 5.9f, 7, 15, 17.4f, 25.8f};
		float categs[] = {1, 1.7f, 4, 5.1f, 6.3f, 6.5f, 7.9f, 8.3f,9};
		float val1;
		float val2;
		int result;
		
		result= categoria(4, categs);

		System.out.println("o numero da catgoria é: "+ result);
	
	}
	
	
	
	public static int categoria(float numero, float[] categs) {
		//para separar as categorias
		float val1;
		float val2;
		
		for(int pos1=0, pos2=1; pos1< categs.length;pos1++,pos2++) {
			
			val1=categs[pos1];
			val2=categs[pos2];
			
			if (numero >= val1 && numero < val2){
				System.out.println("a categoria está  entre os valores "+ val1+ "e "+ val2);
				return pos2;
			}
			
			
		}
		return -1;
		
	}





}
