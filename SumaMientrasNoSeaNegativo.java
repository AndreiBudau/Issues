/**
*Define la clase SumaMientrasNoSeaNegativo que sume todos aquellos números leídos
*mientras no sean negativos.
*@author Andrei Alexandru Budau y José Antonio Aguilar Granados
*@version 1.0
*/
class SumaMientrasNoSeaNegativo{
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);//sirve para poder introducir uno o varios datos
		System.out.println("Introduce n\u00FAmero");//muestra el mensaje por pantalla
		int numero;//declaracion de la variable
		numero = scanner.nextInt();//sirve para que lea el numero que hemos introducido
		int suma=0;
		while(numero>0){
			suma = suma+numero;
			System.out.println("el resultado es " +suma);//muestra el mensaje por pantalla
			System.out.println("Introduce n\u00FAmero");//muestra el mensaje por pantalla
			numero = scanner.nextInt();//sirve para que lea el numero que hemos introducido
		}
	}
}