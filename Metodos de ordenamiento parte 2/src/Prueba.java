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
class Ordenamiento{
	public int[] OrdenamientoMezcla(int arreglo[]) {
		int i,j,k;
		if(arreglo.length>1) {
			int numElementosIzq=arreglo.length/2;
			int numElementosDer=arreglo.length-numElementosIzq;
			int arregloizquierdo[] = new int [numElementosIzq];
			int arregloderecho[] = new int [numElementosDer];
			
			for(i=0;i<numElementosIzq;i++){
				arregloizquierdo[i] = arreglo[i];
			}
			for(i=numElementosIzq;i<numElementosIzq+numElementosDer;i++) {
				arregloderecho[i-numElementosIzq]=arreglo[i];
			}
			arregloizquierdo=OrdenamientoMezcla(arregloizquierdo);
			arregloderecho=OrdenamientoMezcla(arregloderecho);
			i=j=k=0;
			while(arregloizquierdo.length!=j && arregloderecho.length!=k){
				if(arregloizquierdo[j]<arregloderecho[k]) {
					arreglo[i]=arregloizquierdo[j];
					i++;
					k++;
				}else {
					arreglo[i] = arregloderecho[k];
					
				}
				
			}
			while(arregloizquierdo.length!=k) {
				arreglo[i]=arregloizquierdo[j];
				i++;
				j++;
			}
			while(arregloderecho.length!=k) {
				arreglo[i]=arregloderecho[k];
				i++;
				j++;
			}
		}
		return arreglo;
		
		
	}
}


public class Prueba {

	public static void main(String[] args) {
		
	}

}
