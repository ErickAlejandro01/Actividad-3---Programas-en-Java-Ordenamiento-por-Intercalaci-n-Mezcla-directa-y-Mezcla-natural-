class Intercalacion{
	
	public static int [] ordenar(int primero[], int segundo []) {
		int arrayOrdenado[] = new int [primero.length+segundo.length];
		int i=0, j=0, k=0;
		
		while(i<primero.length && j<segundo.length) {
			if(primero[i]<segundo[j]) {
				arrayOrdenado[k] = primero[i];
				k++;
				i++;
				
			}else{
				arrayOrdenado[k] = segundo[j];
				j++;
				k++;
			}
			
		}
		while(j<segundo.length) {
			arrayOrdenado[k] = segundo[j];
			j++;
			k++;
		}
		while(i<primero.length) {
			arrayOrdenado[k] = primero[i];
			i++;
			k++;
		}
		return arrayOrdenado;
	}
}






public class PruebaDeOrdenamientoIntercalacion {

	public static void main(String[] args) {
		int primero [] = {1,2,10,37,50};
		int segundo [] = {30,300};
	}

}