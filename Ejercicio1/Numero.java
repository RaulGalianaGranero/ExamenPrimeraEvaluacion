public class Numero{ //Programa que evalua un numero por argumento
	
	public static void main(String args[]){
		
		int x=Integer.parseInt(args[0]);
		System.out.println("El numero introducido es "+x);
		
		if (x>4 && x<1000){
			
			if(x%2==0){ //Evaluacion de par o impar
				
				System.out.printf("El numero %d es par%n",x);
				
				}
				
			else{
				
				System.out.printf("El numero %d es impar%n",x);
				
				}
				
			if (x%3==0 && x%5==0){ //Evaluacion de multiplo de 3 y 5
				
				System.out.printf("El numero %d es multiplo de 3 y 5%n",x);
				
				}	
				
			else {
				
				System.out.printf("El numero %d no es multiplo de 3 y 5%n",x);
				
				}
				
				String cadena=""+x; //Parseo a cadena de x
				int digitos=cadena.length();
				System.out.printf("El numero %d tiene %d digitos%n",x,digitos);
			}
			
		else { //Numero no valido
			
			System.out.println("Numero introducido no valido");
			}
	}
}
