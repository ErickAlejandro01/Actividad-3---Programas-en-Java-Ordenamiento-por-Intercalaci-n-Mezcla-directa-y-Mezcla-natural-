import java.util.Arrays;

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




public class PruebaDeOrdenamientoPorMezclaDirecta {

	public static void main(String[] args) {
		Ordenamiento o1 = new Ordenamiento();
		int vector[] = {5,10,7,4,1,8,2,3,6,9};
		System.out.print("Vector Desordenado"+ Arrays.toString(vector));
		int vector2 [] ;
		vector2 = o1.OrdenamientoMezcla(vector);
		System.out.print("vectorOrdenado"+ Arrays.toString(vector2));
		
		
	
	}

}
