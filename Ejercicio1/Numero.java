public class Numero{ //Programa que evalua un numero por argumento
	
	public static void main(String args[]){
		
		int numero=Integer.parseInt(args[0]);
		System.out.println("El numero introducido es "+numero);
		
		if (numero>4 && numero<1000){
			
			if(numero%2==0){ //Evaluacion de par o impar
				
				System.out.printf("El numero %d es par%n",numero);
				
				}
				
			else{
				
				System.out.printf("El numero %d es impar%n",numero);
				
				}
				
			if (numero%3==0 && numero%5==0){ //Evaluacion de multiplo de 3 y 5
				
				System.out.printf("El numero %d es multiplo de 3 y 5%n",numero);
				
				}	
				
			else {
				
				System.out.printf("El numero %d no es multiplo de 3 y 5%n",numero);
				
				}
				
				String cadena=""+numero; //Parseo a cadena de numero
				int digitos=cadena.length();
				System.out.printf("El numero %d tiene %d digitos%n",numero,digitos);
			}
			
		else { //Numero no valido
			
			System.out.println("Numero introducido no valido");
			}
	}
}
