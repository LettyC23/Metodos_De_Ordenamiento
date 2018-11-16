import java.util.Arrays;

class MetodosOrdenamiento{
	
	public void ordenamientoBurbuja( int arreglo[]) {
		long TInicio, TFin, tiempo;
		TInicio = System.currentTimeMillis();
		int recorridos=0, intercambios=0, comparaciones=0;
		for (int i = 0; i < arreglo.length; i++) {
			recorridos++;
			for (int j = 0; j < arreglo.length; j++) {
				
				if (arreglo[i] > arreglo[j]) {
					int aux = arreglo[i];
					arreglo[i] = arreglo[j];
					arreglo[j] = aux;
					intercambios++;
				}
				
			}	
			comparaciones++;
		}
		System.out.println(Arrays.toString(arreglo));
		System.out.println("Recorridos: " + comparaciones);
		System.out.println("Intercambios: " +intercambios);
		System.out.println("Recorridos: " +recorridos);
		TFin = System.currentTimeMillis();
		 tiempo = TFin - TInicio; //Calculamos los milisegundos de diferencia
		  System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);
	}
	
	public void ordenamientoBurbuja1(int arreglo1 []) {
		long TInicio, TFin, tiempo;
		TInicio = System.currentTimeMillis();
		int recorridos=0, intercambios=0, comparaciones=0;
		for (int i = 0; i < arreglo1.length; i=i+2) {
			recorridos++;
			for (int j = 0; j < arreglo1.length-1; j++) {
				if (arreglo1[j]< arreglo1[j+1]) {
					int aux = arreglo1[j];
					arreglo1[j] = arreglo1[j+1];
					arreglo1[j+1] = aux;
					intercambios++;
				}
			}
			comparaciones++;
		}
		System.out.println(Arrays.toString(arreglo1));
		System.out.println("Recorridos: " + comparaciones);
		System.out.println("Intercambios: " +intercambios);
		System.out.println("Recorridos: " + recorridos);
		TFin = System.currentTimeMillis();
		 tiempo = TFin - TInicio; //Calculamos los milisegundos de diferencia
		  System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);
	}
	public void ordenamientoBurbuja2(int [] arreglo2) {
		long TInicio, TFin, tiempo;
		TInicio = System.currentTimeMillis();
		int recorridos=0, intercambios=0, comparaciones=0;
	int i =0;
		boolean ordenado = false;
		if (i<arreglo2.length && ordenado == false) {
			for (int j = 0; j < arreglo2.length; j++) {
				recorridos++;
				ordenado = true;
				for (int j2 = 0; j2 < arreglo2.length-1; j2++) {
					
					if (arreglo2[j2] > arreglo2[j2+1]) {
						ordenado = false;
						int aux = arreglo2[j2];
						arreglo2[j2] = arreglo2 [j2 +1];
						arreglo2 [j2+1] = aux;
						intercambios++;	
					}
					
				}
				comparaciones++;
			}
		}
		System.out.println(Arrays.toString(arreglo2));
		System.out.println("Recorridos: " + comparaciones);
		System.out.println("Intercambios: " +intercambios);
		System.out.println("Recorridos: " +recorridos);
		TFin = System.currentTimeMillis();
		 tiempo = TFin - TInicio; //Calculamos los milisegundos de diferencia
		  System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);
		
	}
	
	public void ordenamientoBurbuja3(int [] arreglo3) {
		long TInicio, TFin, tiempo;
		TInicio = System.currentTimeMillis();
		int recorridos=0, intercambios=0, comparaciones=0;
		int i =0;
		boolean ordenado = false;
		while (!(i<arreglo3.length  && ordenado == true)) {
			
		if (i<arreglo3.length && ordenado == false) {
			for (int j = 0; j < arreglo3.length; j++) {
				recorridos++;
				ordenado = true;
				for (int j2 = 0; j2 < arreglo3.length-1; j2++) {
					
					if (arreglo3[j2] > arreglo3[j2+1]) {
						ordenado = false;
						int aux = arreglo3[j2];
						arreglo3[j2] = arreglo3 [j2 +1];
						arreglo3 [j2+1] = aux;
						intercambios++;
					}
				}
				comparaciones++;
			}
		}
			
		}
		System.out.println(Arrays.toString(arreglo3));
		System.out.println("Recorridos: " + comparaciones);
		System.out.println("Intercambios: " +intercambios);
		System.out.println("Recorridos: " +recorridos);
		TFin = System.currentTimeMillis();
		 tiempo = TFin - TInicio; //Calculamos los milisegundos de diferencia
		  System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);
	}
	
	
	
}

public class EjemploMetodosOrdenamiento {

	public static void main(String[] args) {
		MetodosOrdenamiento mo = new MetodosOrdenamiento();
		int arreglo[]= {34, 25, 12, 87, 9, 10, 34, 37, 24, 2};
		int arreglo1[]= {34, 25, 12, 87, 9, 10, 34, 37, 24, 2};
		int arreglo2[]= {34, 25, 12, 87, 9, 10, 34, 37, 24, 2};
		int arreglo3[]= {34, 25, 12, 87, 9, 10, 34, 37, 24, 2};
		int numeros [] = {34, 25, 12, 87, 9, 10, 34, 37, 24, 2}; 
		System.out.println("================ ORDENAMIENTO CON BURBUJA ===============");
		System.out.println("Burbuja 0");
		mo.ordenamientoBurbuja(arreglo);
		System.out.println("Burbuja 1");
		mo.ordenamientoBurbuja1(arreglo1);
		System.out.println("Burbuja 2");
		mo.ordenamientoBurbuja2(arreglo);
		System.out.println("Burbuja 3");
		mo.ordenamientoBurbuja3(arreglo);
		
	
	}

}