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
	
	
		
	public void ordenamientoPorSeleccion (int [] numeros){
		long TInicio, TFin, tiempo;
		TInicio = System.currentTimeMillis();
		int recorridos=0, intercambios=0, comparaciones=0;
		for (int i=0; i<numeros.length; i++){
		int minimo = i;
		for (int j =0; j<numeros.length; j++){
			if(numeros[j]<numeros[minimo]){
			minimo = j;
			intercambios++;
			}
		int aux = numeros[i];
		numeros[i] = numeros[minimo];
		numeros[minimo] = aux;
		comparaciones++;
			}
		recorridos++;
		}
		
		System.out.println(Arrays.toString(numeros));
		System.out.println("Recorridos: " + recorridos);
		System.out.println("Intercambios: " + intercambios);
		System.out.println("Comparaciones: " + comparaciones);
		TFin = System.currentTimeMillis();
		 tiempo = TFin - TInicio; //Calculamos los milisegundos de diferencia
		  System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);
	}	
	
	
	public void ordenamientoPorInsercion(int arreglo[]) {
		long TInicio, TFin, tiempo;
		TInicio = System.currentTimeMillis();
		int recorridos=0, intercambios=0, comparaciones=0;
		int aux =0;
		
		for (int i = 0; i < arreglo.length; i++) {
			recorridos++;
		aux = arreglo[i];
		int j = i-1;
		
		while (j>=0 && aux <= arreglo[j]) {
			arreglo[j+1] = arreglo[j];

			comparaciones++;
			j--;
		}
		arreglo[j+1] = aux;
		intercambios++;
		}
		System.out.println(Arrays.toString(arreglo));
		System.out.println("Intercambios: "+intercambios);
		System.out.println("Comparaciones: "+comparaciones );
		System.out.println("Recorridos: "+recorridos);
		TFin = System.currentTimeMillis();
		 tiempo = TFin - TInicio; //Calculamos los milisegundos de diferencia
		  System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);
	}
	
	public void ordenamientoShellsort(int A[]) {
		long TInicio, TFin, tiempo;
		TInicio = System.currentTimeMillis();
		int salto, aux,i;
		boolean cambios;
		int recorridos=0, intercambios=0,comparaciones=0;
		for (salto = A.length/2; salto !=0; salto/=2) {
			recorridos++;
			cambios = true;
			while (cambios) {
				cambios = false;
				for (i = salto; i < A.length; i++) {
					if (A[i-salto]>A[i]) {
						intercambios++;
						aux= A[i];
						A[i] = A[i-salto];
						A[i-salto] = aux;
						cambios = true;
						
					}comparaciones++;
				}
			}
		}
		System.out.println("Recorridos: "+ recorridos);
		System.out.println("Intercambios: " + intercambios);
		System.out.println("Comparaciones: " + comparaciones);
		TFin = System.currentTimeMillis();
		 tiempo = TFin - TInicio; //Calculamos los milisegundos de diferencia
		  System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);
	}
	
	public void mostarArreglo(int A[]) {
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + ", ");
		}
	}
	
		public void ordenamientoQuickSort(int vector[], int izquierda, int derecha) {
		int recorridos=0, intercambios = 0, comparaciones=0;
		long TFin, TInicio, tiempo;
		
		TInicio = System.currentTimeMillis();
		
		int pivote = vector[izquierda];
        int i = izquierda;
        int j = derecha;
        int auxIntercambio;
        while (i < j) {
            while (vector[i] <= pivote && i < j) {
                i++;
            }
            while (vector[j] > pivote) {
                j--;
            }
            if (i < j) {
            	comparaciones ++;
                auxIntercambio = vector[i];
                vector[i] = vector[j];
                vector[j] = auxIntercambio;
                intercambios++;
            }
            
        }
        recorridos++;
        vector[izquierda] = vector[j];
        vector[j] = pivote;
        intercambios++;
        if (izquierda < j - 1) {
        	ordenamientoQuickSort(vector, izquierda, j - 1);
        }
        if (j + 1 < derecha) {
        	ordenamientoQuickSort(vector, j + 1, derecha);
        }
        
        System.out.println(Arrays.toString(vector));
        System.out.println("Recorridos: "+ recorridos);
		System.out.println("Intercambios: " + intercambios);
		System.out.println("Comparaciones: " + comparaciones);
		TFin = System.currentTimeMillis();
		 tiempo = TFin - TInicio; //Calculamos los milisegundos de diferencia
		  System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);
	}
	
	
	public void intercalacionDeArchivos() {
			File archivo1=new File("./src/Archivo1.txt");//Archivos a leer
			File archivo2=new File("./src/Archivo2.txt");//Archivos a leer
					
			FileReader frA1 = null;
			BufferedReader brA1;
			FileReader frA2 = null;
			BufferedReader brA2;
			
			FileWriter archivo3=null;
			PrintWriter pr=null;
			
			try{//Apertura del archivo de salida para escritura
				archivo3=new FileWriter("./src/ArchivoSalida.txt", false);
				pr=new PrintWriter(archivo3);
				
				try {//Apertura del archivo1 para lectura
					frA1=new FileReader(archivo1);
					brA1=new BufferedReader(frA1);
					String lineaArchivo1;
					
					try {//Apertura del archivo2 para lectura
						frA2=new FileReader(archivo2);
						brA2=new BufferedReader(frA2);
						String lineaArchivo2;
						boolean repetir=true;
						
						lineaArchivo1=brA1.readLine();
						lineaArchivo2=brA2.readLine();
											
						do{//Se realizan comparaciones mientras la bandera no cambie
							if(Integer.parseInt(lineaArchivo1)<Integer.parseInt(lineaArchivo2)){
								pr.println(lineaArchivo1);
								if((lineaArchivo1=brA1.readLine())==null){
									pr.println(lineaArchivo2);
									while((lineaArchivo2=brA2.readLine())!=null){
										pr.println(lineaArchivo2);
									}
									repetir=false;
								}
							}
							else if(Integer.parseInt(lineaArchivo1)>Integer.parseInt(lineaArchivo2)){
								pr.println(lineaArchivo2);
								if((lineaArchivo2=brA2.readLine())==null){
									pr.println(lineaArchivo1);
									while((lineaArchivo1=brA1.readLine())!=null){
										pr.println(lineaArchivo1);
									}
									repetir=false;
								}
							}
							else{
								pr.println(lineaArchivo1);
								pr.println(lineaArchivo2);
								if((lineaArchivo1=brA1.readLine())==null){
									pr.println(lineaArchivo2);
									while((lineaArchivo2=brA2.readLine())!=null){
										pr.println(lineaArchivo2);
									}
									repetir=false;
								}
								if((lineaArchivo2=brA2.readLine())==null){
									pr.println(lineaArchivo1);
									while((lineaArchivo1=brA1.readLine())!=null){
										pr.println(lineaArchivo1);
									}
									repetir=false;
								}
							}
						}while(repetir);
					} catch (FileNotFoundException e) {
						System.out.println("Error al abrir el archivo");
						//e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}finally{
						try {
							frA2.close();
						} catch (IOException e) {
							System.out.println("Error al cerrar el archivo");
						}	
					}//Final del archivo2
				} catch (FileNotFoundException e) {
					System.out.println("Error al abrir el archivo");
					//e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}finally{
					try {
						frA1.close();
					} catch (IOException e) {
						System.out.println("Error al cerrar el archivo");
					}
				}//Final del archivo1
				System.out.println("Archivos combinados y ordenados correctamente");
			}catch (IOException e){
				System.out.println("Error al abrir o crear el archivo");
			}finally{
				try{
					archivo3.close();
				}catch(IOException e){
					System.out.println("Error al cerrar el archivo");
				}
			}
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
		
		System.out.println("================ ORDENAMIENTO POR SELECCION ===============");
		System.out.println("Arreglo sin ordenar: " + Arrays.toString(arreglo));
		System.out.println("Arreglo ordenado: ");
		mo.ordenamientoPorSeleccion(numeros);
		
		
		System.out.println("================= ORDENAMIENTO POR INSERCION ==============");
		System.out.println("Arreglo sin ordenar: " + Arrays.toString(arreglo));
		System.out.println("Arreglo ordenado: ");
		mo.ordenamientoPorInsercion(lista);

		
		System.out.println("================= ORDENAMIENTO POR SHELLSORT ==============");
		int A [] = {34, 25, 12, 87, 9, 10, 34, 37, 24, 2};
		int vecS[];
		vecS = new int [100];
		for (int i = 0; i < vecS.length; i++) {
			vecS[i] = new Random().nextInt(100);
		}
		int vec[];
		vec = new int [1000];
		for (int i = 0; i < vec.length; i++) {
			vec[i] = new Random().nextInt(1000);
		}
		int vecS1[];
		vecS1 = new int [1000000];
		for (int i = 0; i < vecS1.length; i++) {
			vecS1[i] = new Random().nextInt(1000000);
		}
		System.out.println("Arreglo sin ordenar: " + Arrays.toString(A));
		System.out.println("Arreglo ordenado con 10 elementos : ");
		mo.ordenamientoShellsort(A);
		mo.mostarArreglo(A);
		System.out.println("Arreglo ordenado con 100 elementos : ");
		mo.ordenamientoShellsort(vecS);
		mo.mostarArreglo(vecS);
		System.out.println("Arreglo ordenado con 1000 elementos : ");
		mo.ordenamientoShellsort(vec);
		mo.mostarArreglo(vec);
		System.out.println("Arreglo ordenado con 1000000 elementos : ");
		mo.ordenamientoShellsort(vecS1);
		mo.mostarArreglo(vecS1);
		
		
			System.out.println("================= ORDENAMIENTO POR QuickSort =============== ");
		int v[];
		v = new int [100];
		for (int i = 0; i < v.length; i++) {
			v[i] = new Random().nextInt(100);
		}
		int vecQ[];
		vecQ = new int [1000];
		for (int i = 0; i < vecQ.length; i++) {
			vecQ[i] = new Random().nextInt(1000);
		}
		int vecQ1[];
		vecQ1 = new int [1000000];
		for (int i = 0; i < vecQ1.length; i++) {
			vecQ1[i] = new Random().nextInt(1000000);
		}
		int numerosQ [] = {34, 25, 12, 87, 9, 10, 34, 37, 24, 2};
		System.out.println("Arreglo sin ordenar: " + Arrays.toString(numerosQ));
		System.out.println("Arreglo ordenado con 10 elementos : ");
		mo.ordenamientoQuickSort(numerosQ, 0 ,0);
		System.out.println("Arreglo ordenado con 100 elementos : ");
		mo.ordenamientoQuickSort(v,0 ,0);
		System.out.println("Arreglo ordenado con 1000 elementos : ");
		mo.ordenamientoQuickSort(vecQ,0 ,0);
		System.out.println("Arreglo ordenado con 1000000 elementos : ");
		mo.ordenamientoQuickSort(vecQ1,0 ,0);
		
	}

}
