package app;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class App {
    public static void main(final String[] args) throws Exception {

        // output
        String tiposLibros;
        String cantLibrerias;
        String dias;

        final ArrayList<Libreria> libreriasTotales = new ArrayList<Libreria>();

        // COMPROBAR LA LECTURA
        System.out.println("============");
        System.out.println("COMPROBAMOS LA LECTURA");
        System.out.println("============");

        final ReadFile r = new ReadFile("a_example.txt", " ");

        final ArrayList<String[]> test = r.read();

        // para la línea 0
        tiposLibros = test.get(0)[0];
        cantLibrerias = test.get(0)[1];
        dias = test.get(0)[2];

        final int[] puntuaciones = new int[Integer.parseInt(tiposLibros)];

        // Buscamos las puntuaciones
        for (int j = 0; j < test.get(1).length; j++) {
            puntuaciones[j] = Integer.parseInt(test.get(1)[j]);
        }

        int posicion = 0;
        Libreria lib;

        for (int i = 2; i < test.size(); i++) {
            if (i % 2 == 0) {
                lib = new Libreria(Integer.parseInt(test.get(i)[0]), Integer.parseInt(test.get(i)[1]),
                        Integer.parseInt(test.get(i)[2]));
                libreriasTotales.add(lib);
                posicion++;
            } else {
                for (int j = 0; j < test.get(i).length; j++) {
                    libreriasTotales.get(posicion).addLibro(test.get(i)[j]);
                }
            }

        }

        posicion = 0;
        ArrayList<Libreria> mayor = new ArrayList<Libreria>();
        mayor = libreriasTotales;
   

        Libreria temp;
        final int t = mayor.size();
        for(int i=1; i< t; i++){
            for( int k = t-1; k>= i; k--){
                if(mayor.get(k).getProceso() < mayor.get(k).getProceso()){
                    temp = mayor.get(k);
                    mayor.get(k) = mayor.get(k-1);
                    mayor.get(k-1) = temp;
                }
            }
        }

           //Ordenamiento por Burbuja 
   // by ramses2999
   publicstatic int[] OrdenarBurbuja(int[] n){
    int temp;
    int t = n.length;
    for (int i = 1; i < t; i++) {
        for (int k = t- 1; k >= i; k--) {
            if(n[k] < n[k-1]){
                temp = n[k];
                n[k] = n[k-1];
                n[k-1]=  temp;
            }//fin if
        }// fin 2 for
    }//fin 1 for
    return n;
}//fin



    }
}