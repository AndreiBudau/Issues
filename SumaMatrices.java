/**
*. Define la clase SumaMatrices que sume dos matrices de enteros. El usuario introducirá
*por teclado las dimensiones de las matrices (m x n). Las matrices se inicializarán de
*forma aleatoria con enteros entre 0 y 10. Se visualizarán sumandos y suma. Completa
*este esqueleto:
*/
class SumaMatrices{
	public static void main(String[] args) {
		/**
		* @PARAM FILAS ENTERO DE LAS FILAS DE LA MATRIZ
		* @PARAM COLUMNAS ENTERO  DE LA S COLUMNAS DE LA MATRIZ
		*/
		int filas=pedirDimension("Introduce el numero de filas"), columnas=pedirDimension("Introduce el numero de columnas");

		/**
		* INICIALIZACIÓN DE LAS MATRICES
		*/
		int [] [] sumando1= new int [filas][columnas];	
		int [] [] sumando2= new int [filas][columnas];
		int [] [] suma= new int [filas][columnas];
		
		crearMatriz(sumando1);
		mostrarResultados(sumando1,"matriz 1:");
		crearMatriz(sumando2);
		mostrarResultados(sumando2 ,"matriz 2:");
		sumaMatriz(suma,sumando1,sumando2);
		mostrarResultados(suma,"matriz Suma:");
	}


	/**
	* METODO QUE PIDE UNA DIMENSION POSITIVA Y LA DEVUELVE
	* @PARAM DIMENSION ENTERO DEL NUMERO DE FILAS
	* @RETURN DIMENSION ENTERO DEL NUMERO DE FILAS
	*/
	private static int pedirDimension(String mensaje){
		int dimension;
		do{
			dimension=Teclado.leerEntero(mensaje);
			if (dimension<=0) {
				System.out.println("ERROR.El numero introducido debe ser mayor que 0 ");
			}
		}while (dimension<=0);
		return dimension;
	}

	
	/**
	* METODO QUE CREA LA MATRIZ
	* @PARAM MATRIZ DE ENTEROS
	*/
	private static void crearMatriz(int[][] matriz){
		for (int i=0;i<matriz.length ;i++ ) {
			for (int j=0;j<matriz[i].length ;j++ ) {
				matriz[i][j]=(int)Math.round(Math.random()*10);
			}
		}
	}
	
	
	/**
	* METODO QUE CREA LA MATRIZ
	* @PARAM SUMA MATRIZ DE ENTEROS RESULTANTE DE SUMANDO1 + SUMANDO2
	* @PARAM SUMANDO1 MATRIZ DE ENTEROS
	* @PARAM SUMANDO2 MATRIZ DE ENTEROS
	*/
	private static void sumaMatriz(int[][] suma, int[][] sumando1, int[][] sumando2){
		for (int i=0;i<sumando1.length ;i++ ) {
			for (int j=0;j<sumando1[i].length ;j++ ) {
				suma[i][j]=sumando1[i][j]+sumando2[i][j];
			}
		}
	}
	
	
	/**
	* METODO QUE MUESTRA LA MATRIZ 
	* @PARAM MATRIZ MATRIZ DE ENTEROS 
	* @PARAM MENSAJE STRING PARA INTRODUCIR UNA CADENA DE CARACTERES
	*/
	private static void mostrarResultados(int[][] matriz, String mensaje){
			System.out.println(mensaje);
			for (int i=0; i<matriz.length; i++){
			
				for (int j=0; j<matriz[i].length; j++){
					System.out.print("\t" + matriz[i][j]);
			}	
			System.out.println();
		}
		System.out.println();
	}

}
